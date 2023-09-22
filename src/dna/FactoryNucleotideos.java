package dna;

public class FactoryNucleotideos {
    
    static Nucleotideo criarFromChar(char cNucleotideo) {

        Nucleotideo oNucleotideo = null;

        switch(cNucleotideo) {
            case 'A': 
                oNucleotideo = criarAdenina();
                break;
            case 'T': 
                oNucleotideo = criarTimina();
                break;
            case 'G': 
                oNucleotideo = criarGuanina();
                break;
            case 'C': 
                oNucleotideo = criarCitosina();
                break;
        }

        return oNucleotideo;
    } 

    static Adenina criarAdenina() {
        return new Adenina();
    }

    static Timina criarTimina() {
        return new Timina();
    }

    static Guanina criarGuanina() {
        return new Guanina();
    }

    static Citosina criarCitosina() {
        return new Citosina();
    }
}
