package dna;

import java.util.ArrayList;

public class SequenciaDNA {

    private int iQuantidadeAdenina  = 0;
    private int iQuantidadeTimina   = 0;
    private int iQuantidadeCitosina = 0;
    private int iQuantidadeGuanina  = 0;

    private ArrayList<Nucleotideo> aSequencia;

    public SequenciaDNA() {
        this.setSequencia(new ArrayList<Nucleotideo>());
    }
    
    public ArrayList<Nucleotideo> getSequencia() {
        return this.aSequencia;
    }

    public SequenciaDNA setSequencia(ArrayList<Nucleotideo> aSequencia) {
        this.aSequencia = aSequencia;
        return this;
    }

    public SequenciaDNA addNucleotideo(Nucleotideo oNucleotideo) {
        this.aSequencia.add(oNucleotideo);

        if(oNucleotideo instanceof Adenina) {
            this.iQuantidadeAdenina++;
        }

        if(oNucleotideo instanceof Timina) {
            this.iQuantidadeTimina++;
        }

        if(oNucleotideo instanceof Guanina) {
            this.iQuantidadeGuanina++;
        }

        if(oNucleotideo instanceof Citosina) {
            this.iQuantidadeCitosina++;
        }

        return this;
    }

    public boolean isValida() {
        return this.iQuantidadeAdenina == this.iQuantidadeTimina
            && this.iQuantidadeGuanina == this.iQuantidadeCitosina;
    }

    @Override
    public String toString() {

        StringBuilder oString = new StringBuilder();

        for(Nucleotideo oNucleotideo: this.getSequencia()) {
            oString.append(oNucleotideo.toString());
        }

        return oString.toString();
    }
}
