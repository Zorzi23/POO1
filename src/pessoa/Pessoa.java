package pessoa;

public class Pessoa {

    //#region Atributos/Constantes

    private String sNome;
    private String sEndereco;

    //#endregion

    //#region Constructor

    public Pessoa(String sNome, String sEndereco) {
        this.setNome(sNome);
        this.setEndereco(sEndereco);
    }

    //#endregion

    //#region Getters/Setters

    public String getNome() {
        return this.sNome;
    }   

    public Pessoa setNome(String sNome) {
        this.sNome = sNome;
        return this;
    }

    public String getEndereco() {
        return this.sEndereco;
    }   

    public Pessoa setEndereco(String sEndereco) {
        this.sEndereco = sEndereco;
        return this;
    }
    
    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString =  new StringBuilder();
        oString.append("Nome: ")
            .append(this.getNome())
            .append("/n")
            .append("Endereço: ")
            .append(this.getEndereco())
            .append("/n");
        return oString.toString();
    }

    //#endregion

}

