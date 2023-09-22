package pessoa;

public class PessoaJuridica extends Pessoa {

    //#region Atributos/Constantes

    private String sCNPJ;
    private String sTipoEmpresa;

    //#endregion

    //#region Constructor

    public PessoaJuridica(String sNome, String sEndereco, String sCNPJ, String sTipoEmpresa) {
        super(sNome, sEndereco);
        this.setCNPJ(sCNPJ);
        this.setTipoEmpresa(sTipoEmpresa);
    }

    //#endregion

    //#region Getters/Setters

    public String getCNPJ() {
        return this.sCNPJ;
    }   

    public Pessoa setCNPJ(String sCNPJ) {
        this.sCNPJ = sCNPJ;
        return this;
    }

    public String getTipoEmpresa() {
        return this.sTipoEmpresa;
    }   

    public Pessoa setTipoEmpresa(String sTipoEmpresa) {
        this.sTipoEmpresa = sTipoEmpresa;
        return this;
    }
    
    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString =  new StringBuilder();
        oString.append(super.toString())
            .append("CNPJ: ")
            .append(this.getCNPJ())
            .append("/n")
            .append("Tipo Empresa: ")
            .append(this.getTipoEmpresa())
            .append("/n");
        return oString.toString();
    }

    //#endregion

}

