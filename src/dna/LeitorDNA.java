package dna;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LeitorDNA {

    public static void ler(FileReader oArquivoDNA, FileWriter oArquivoFitasInvalidas) throws IOException {

        BufferedReader oDNA = new BufferedReader(oArquivoDNA);
        BufferedWriter oFitasInvalidas = new BufferedWriter(oArquivoFitasInvalidas);

        String sConteudoLinha;

        int iLinha = 1;
        int iFitasValidas = 0;

        ArrayList<SequenciaDNA> aFitasInvalidas = new ArrayList<SequenciaDNA>();

        while ((sConteudoLinha = oDNA.readLine()) != null) {
            SequenciaDNA aFitaDNA = new SequenciaDNA();

            for (int iSequencia = 0; iSequencia < sConteudoLinha.length(); iSequencia++) {
                Nucleotideo oNucleotideo = FactoryNucleotideos.criarFromChar(sConteudoLinha.charAt(iSequencia));
                aFitaDNA.addNucleotideo(oNucleotideo);
            }

            StringBuilder oStringFitaInvalida = new StringBuilder();
            
            if(!aFitaDNA.isValida()) {
                oStringFitaInvalida.append("****FITA INVALIDA - ")
                    .append(iLinha)
                    .append(" ")
                    .append(sConteudoLinha)
                    .append("\n");
                aFitasInvalidas.add(aFitaDNA);
                oFitasInvalidas.write(oStringFitaInvalida.toString());
            }
            else {
                iFitasValidas++;
            }

            iLinha++;
        }

        oFitasInvalidas.close();

        System.out.println("Total de fitas do arquivo original: " + iLinha);
        System.out.println("Número de fitas válidas: " + iFitasValidas);
        System.out.println("Número de fitas inválidas: " + aFitasInvalidas.size());
        
        System.out.println("Fitas inválidas: " + aFitasInvalidas.size());
        for (SequenciaDNA aSequenciaDNA: aFitasInvalidas) {
            System.out.println(aSequenciaDNA);
        }
    }
}
