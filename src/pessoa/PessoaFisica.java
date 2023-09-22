package pessoa;

public class PessoaFisica extends Pessoa {

    //#region Atributos/Constantes

    private String sCPF;
    private String sEstadoCivil;

    //#endregion

    //#region Constructor

    public PessoaFisica(String sNome, String sEndereco, String sCPF, String sEstadoCivil) {
        super(sNome, sEndereco);
        this.setCPF(sCPF);
        this.setEstadoCivil(sEstadoCivil);
    }

    //#endregion

    //#region Getters/Setters

    public String getCPF() {
        return this.sCPF;
    }   

    public Pessoa setCPF(String sCPF) {
        this.sCPF = sCPF;
        return this;
    }

    public String getEstadoCivil() {
        return this.sEstadoCivil;
    }   

    public Pessoa setEstadoCivil(String sEstadoCivil) {
        this.sEstadoCivil = sEstadoCivil;
        return this;
    }
    
    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString =  new StringBuilder();
        oString.append(super.toString())
            .append("CPF: ")
            .append(this.getCPF())
            .append("/n")
            .append("Estado Civil: ")
            .append(this.getEstadoCivil())
            .append("/n");
        return oString.toString();
    }

    //#endregion

}

