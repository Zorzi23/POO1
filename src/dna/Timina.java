package dna;

public class Timina implements Nucleotideo {
    
    //#region Atributos/Constantes

    private Adenina oAdenina;

    //#endregion

    public Adenina getAdenina() {
        return this.oAdenina;
    }

    public Timina setAdenina(Adenina oAdenina) {
        this.oAdenina = oAdenina;
        return this;
    }

    //#region Ligação

    @Override
    public void ligar(Nucleotideo oNucleotideo) {

        if(!(oNucleotideo instanceof Adenina)) {
            throw new UnsupportedOperationException("Nucleotideo não suportado.");
        }

        this.setAdenina((Adenina) oNucleotideo);
    }

    //#endregion

    @Override
    public String toString() {
        return "T";
    }
}   
