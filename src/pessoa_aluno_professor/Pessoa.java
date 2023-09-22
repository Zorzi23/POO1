package pessoa_aluno_professor;

public class Pessoa {
    
    //#region Atributos/Constantes

    private int iCodigo;
    private String sNome;
    private String sEndereco;

    //#endregion

    //#region Getters/Setters

    public int getCodigo() {
        return this.iCodigo;
    }

    public Pessoa setCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
        return this;
    }

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
        StringBuilder oString = new StringBuilder();
        oString.append("Codigo:")
            .append(this.getCodigo())
            .append("\n")
            .append("Nome:")
            .append(this.getNome())
            .append("\n")
            .append("Endereço:")
            .append(this.getEndereco())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}
