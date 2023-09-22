package item;

public class Livro extends Item {

    //#region Atributos/Constantes

    private String sAutor;

    //#endregion

    //#region Constructor

    public Livro(int iCodigo, String sDescricao, String sAutor) {
        super(iCodigo, sDescricao);
        this.setAutor(sAutor);
    }

    //#endregion

    //#region Getters/Setters

    public String getAutor() {
        return this.sAutor;
    }   

    public Livro setAutor(String sAutor) {
        this.sAutor = sAutor;
        return this;
    }
    
    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString =  new StringBuilder();
        oString.append(super.toString())
            .append("Autor: ")
            .append(this.getAutor())
            .append("/n");
        return oString.toString();
    }

    //#endregion

}

