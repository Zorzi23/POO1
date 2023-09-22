package dna;

public class Citosina implements Nucleotideo {
    
    //#region Atributos/Constantes

    private Guanina oGuanina;

    //#endregion

    public Guanina getGuanina() {
        return this.oGuanina;
    }

    public Citosina setGuanina(Guanina oGuanina) {
        this.oGuanina = oGuanina;
        return this;
    }

    //#region Ligação

    @Override
    public void ligar(Nucleotideo oNucleotideo) {

        if(!(oNucleotideo instanceof Citosina)) {
            throw new UnsupportedOperationException("Nucleotideo não suportado.");
        }

        this.setGuanina((Guanina) oNucleotideo);
    }

    //#endregion

    @Override
    public String toString() {
        return "C";
    }
}
