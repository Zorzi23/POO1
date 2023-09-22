package item;

public class Midia extends Item {

    //#region Atributos/Constantes

    private String sGravadora;
    private float fDuracao;

    //#endregion

    //#region Constructor

    public Midia(int iCodigo, String sDescricao, String sGravadora, float fDuracao) {
        super(iCodigo, sDescricao);
        this.setGravadora(sGravadora);
        this.setDuracao(fDuracao);
    }

    //#endregion

    //#region Getters/Setters

    public String getGravadora() {
        return this.sGravadora;
    }   

    public Midia setGravadora(String sGravadora) {
        this.sGravadora = sGravadora;
        return this;
    }
    
    public float getDuracao() {
        return this.fDuracao;
    }   

    public Midia setDuracao(float fDuracao) {
        this.fDuracao = fDuracao;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString =  new StringBuilder();
        oString.append(super.toString())
            .append("Gravadora: ")
            .append(this.getGravadora())
            .append("/n")
            .append("Duração: ")
            .append(this.getDuracao())
            .append("/n");
        return oString.toString();
    }

    //#endregion

}

