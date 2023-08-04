import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner oEntrada = new Scanner(System.in);
        System.out.println("Informe os valor da Base: ");
        double dBase = oEntrada.nextDouble();
        System.out.println("Informe os valor da Altura: ");
        double dAltura = oEntrada.nextDouble();
        System.out.println("Informe o tipo da Tinta: ");
        double iTipo = oEntrada.nextInt();

        double dPrecoTipoTintaInformada = 0;
        
        if(iTipo == 1) {
            dPrecoTipoTintaInformada = 127.90;
        }
        else if(iTipo == 2) {
            dPrecoTipoTintaInformada = 258.98;
        }
        else if(iTipo == 3) {
            dPrecoTipoTintaInformada = 344.34;
        }

        TrianguloRetangulo oTriangulo = new TrianguloRetangulo(dAltura, dBase);
        
        double dAreaLateralPiramide = calcularAreaLateralPiramide(oTriangulo);
        double dAreaBasePiramide = calcularAreaBasePiramide(oTriangulo);
        double dAreaTotal = calcularAreaTotalPiramide(dAreaBasePiramide, dAreaLateralPiramide);
        double dVolumePiramide = calcularVolumePiramide(oTriangulo);
        double dLitros = dAreaTotal / 4.76;
        double dQuantidadeLatas = (int) Math.ceil(dLitros / 18);
        double dPrecoTinta = dQuantidadeLatas * dPrecoTipoTintaInformada;

        System.out.println(oTriangulo);
        System.out.println("Área Lateral: " + dAreaLateralPiramide);
        System.out.println("Área Base: " + dAreaBasePiramide);
        System.out.println("Área Total: " + dAreaTotal);
        System.out.println("Litros: " + dLitros);
        System.out.println("Quantidade de Latas: " + dQuantidadeLatas);
        System.out.println("Preço: " + (float) dPrecoTinta);
        System.out.println("Volume: " + dVolumePiramide);
        oEntrada.close();
    }

    public static double calcularAreaLateralPiramide(TrianguloRetangulo oTrianguloRetangulo) {
        return (oTrianguloRetangulo.getHipotenusa() * 2 * oTrianguloRetangulo.getBase()) /2;
    }

    public static double calcularAreaBasePiramide(TrianguloRetangulo oTrianguloRetangulo) {
        return Math.pow(2 * oTrianguloRetangulo.getBase(), 2);
    }

    public static double calcularAreaTotalPiramide(double dAreaBasePiramide, double dAreaLateral) {
        return dAreaBasePiramide + (4 * dAreaLateral);
    }

    public static double calcularVolumePiramide(TrianguloRetangulo oTrianguloRetangulo) {
        
        double dAreaBasePiramide = calcularAreaBasePiramide(oTrianguloRetangulo);

        return (dAreaBasePiramide / 3) * oTrianguloRetangulo.getAltura();
    }
}
