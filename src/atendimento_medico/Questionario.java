package atendimento_medico;

import java.util.ArrayList;

public class Questionario {
   
    private int iEscalaDor = 0;
    private String sSintomas;
    private boolean bUsaMedicamentoContinuo;
    private ArrayList<CID> aDoencas;
    private ArrayList<String> aAlergias;
    private String sObservacao;

    public Questionario(int iEscalaDor, String sSintomas, boolean bUsaMedicamentoContinuo, ArrayList<CID> aDoencas, ArrayList<String> aAlergias, String sObservacao) {
        this.setEscalaDor(iEscalaDor);
        this.setSintomas(sSintomas);
        this.setObservacao(sObservacao);
    }

    public int getEscalaDor() {
        return this.iEscalaDor;
    }

    public void setEscalaDor(int iEscalaDor) {
        this.iEscalaDor = iEscalaDor;
    }

    public String getSintomas() {
        return this.sSintomas;
    }

    public void setSintomas(String sSintomas) {
        this.sSintomas = sSintomas;
    }

    public boolean isUsaMedicamentoContinuo() {
        return this.bUsaMedicamentoContinuo;
    }

    public void setUsaMedicamentoContinuo(boolean bUsaMedicamentoContinuo) {
        this.bUsaMedicamentoContinuo = bUsaMedicamentoContinuo;
    }

    public ArrayList<CID> getDoencas() {
        return this.aDoencas;
    }

    public void setDoencas(ArrayList<CID> aDoencas) {
        this.aDoencas = aDoencas;
    }

    public ArrayList<String> getAlergias() {
        return this.aAlergias;
    }

    public void setAlergias(ArrayList<String> aAlergias) {
        this.aAlergias = aAlergias;
    }

    public String getObservacao() {
        return this.sObservacao;
    }

    public void setObservacao(String sObservacao) {
        this.sObservacao = sObservacao;
    }
    

}
