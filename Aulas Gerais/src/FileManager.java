import java.io.FileWriter;

public class FileManager {
    
    public static void criar(String sConteudo, String sNomeAndTipo) {

        try {
            FileWriter oArquivo = new FileWriter(sNomeAndTipo);
            oArquivo.write(sConteudo);
            oArquivo.close();

            System.out.println("Arquivo criado com sucesso.");
        } catch (Exception oEx) {
            System.err.println("Erro ao criar o arquivo.");
        }

    }

}
