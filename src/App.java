import java.io.FileReader;
import java.io.FileWriter;

import dna.LeitorDNA;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader oFitaDNA = new FileReader("src/FitaDNA.txt");
        FileWriter oFitasInvalidas = new FileWriter("src/FitasInvalidas.txt");

        try {
            LeitorDNA.ler(oFitaDNA, oFitasInvalidas);
        } catch (Exception e) {
        }
    }
}
