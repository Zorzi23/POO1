import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner oScanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de números a serem gerados: ");
        int quantidadeNumeros = oScanner.nextInt();

        System.out.print("Informe o valor mínimo da amostra: ");
        int valorMinimo = oScanner.nextInt();

        System.out.print("Informe o valor máximo da amostra: ");
        int valorMaximo = oScanner.nextInt();

        List<Integer> aNumerosGerados = gerarNumerosAleatorios(quantidadeNumeros, valorMinimo, valorMaximo);

        criarArquivoHTML(aNumerosGerados);

        System.out.println("Arquivo HTML com o gráfico foi criado.");

        oScanner.close();
    }

    private static List<Integer> gerarNumerosAleatorios(int iQuantidade, int iMinimo, int iMaximo) {
        List<Integer> aNumeros = new ArrayList<>();
        Random oRandom = new Random();

        for (int iNumero = 0; iNumero < iQuantidade; iNumero++) {
            aNumeros.add(oRandom.nextInt(iMaximo - iMinimo + 1) + iMinimo);
        }

        return aNumeros;
    }

    private static void criarArquivoHTML(List<Integer> aNumeros) {
        FileManager.criar(criarHTML(aNumeros), "grafico.html");
    }

    private static String criarHTML(List<Integer> aNumeros) {
        StringBuilder oHtmlBuilder = new StringBuilder();
        oHtmlBuilder.append("<html>\n<head>\n");
        oHtmlBuilder.append("<script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
        oHtmlBuilder.append("<script type=\"text/javascript\">\n");
        oHtmlBuilder.append("google.charts.load('current', {'packages':['corechart']});\n");
        oHtmlBuilder.append("google.charts.setOnLoadCallback(drawChart);\n");
        oHtmlBuilder.append("function drawChart() {\n");
        oHtmlBuilder.append("var data = new google.visualization.DataTable();\n");
        oHtmlBuilder.append("data.addColumn('number', 'Contador');\n");
        oHtmlBuilder.append("data.addColumn('number', 'Números Gerados');\n");
        oHtmlBuilder.append("data.addRows([\n");

        for (int i = 0; i < aNumeros.size(); i++) {
            oHtmlBuilder.append("[").append(i + 1).append(", ").append(aNumeros.get(i)).append("],\n");
        }

        oHtmlBuilder.append("]);\n");
        oHtmlBuilder.append("var options = {'title':'Gráfico de Números Gerados', 'width':800, 'height':600};\n");
        oHtmlBuilder.append("var chart = new google.visualization.LineChart(document.getElementById('chart_div'));\n");
        oHtmlBuilder.append("chart.draw(data, options);\n");
        oHtmlBuilder.append("}\n");
        oHtmlBuilder.append("</script>\n");
        oHtmlBuilder.append("</head>\n<body>\n");
        oHtmlBuilder.append("<div id=\"chart_div\"></div>\n");
        oHtmlBuilder.append("</body>\n</html>\n");

        return oHtmlBuilder.toString();
    }
}
