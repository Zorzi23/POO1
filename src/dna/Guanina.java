package dna;

public class Guanina implements Nucleotideo {
    
    //#region Atributos/Constantes

    private Citosina oCitosina;

    //#endregion

    public Citosina getCitosina() {
        return this.oCitosina;
    }

    public Guanina setCitosina(Citosina oCitosina) {
        this.oCitosina = oCitosina;
        return this;
    }

    //#region Ligação

    @Override
    public void ligar(Nucleotideo oNucleotideo) {

        if(!(oNucleotideo instanceof Citosina)) {
            throw new UnsupportedOperationException("Nucleotideo não suportado.");
        }

        this.setCitosina((Citosina) oNucleotideo);
    }

    //#endregion

    @Override
    public String toString() {
        return "G";
    }
}
