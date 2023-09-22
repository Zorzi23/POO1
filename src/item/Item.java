package item;

public class Item {

    //#region Atributos/Constantes

    private int iCodigo;
    private String sDescricao;

    //#endregion

    //#region Constructor

    public Item(int iCodigo, String sDescricao) {
        this.setCodigo(iCodigo);
        this.setDescricao(sDescricao);
    }

    //#endregion

    //#region Getters/Setters

    public int getCodigo() {
        return this.iCodigo;
    }   

    public Item setCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
        return this;
    }

    public String getDescricao() {
        return this.sDescricao;
    }   

    public Item setDescricao(String sDescricao) {
        this.sDescricao = sDescricao;
        return this;
    }
    
    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString =  new StringBuilder();
        oString.append("Codigo: ")
            .append(this.getCodigo())
            .append("/n")
            .append("Descrição: ")
            .append(this.getDescricao())
            .append("/n");
        return oString.toString();
    }

    //#endregion

}

