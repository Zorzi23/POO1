package dna;

public class Adenina implements Nucleotideo {
    
    //#region Atributos/Constantes

    private Timina oTimina;

    //#endregion

    public Timina getTimina() {
        return this.oTimina;
    }

    public Adenina setTimina(Timina oTimina) {
        this.oTimina = oTimina;
        return this;
    }

    //#region Ligação

    @Override
    public void ligar(Nucleotideo oNucleotideo) {

        if(!(oNucleotideo instanceof Timina)) {
            throw new UnsupportedOperationException("Nucleotideo não suportado.");
        }

        this.setTimina((Timina) oNucleotideo);
    }

    //#endregion

    @Override
    public String toString() {
        return "A";
    }
}
