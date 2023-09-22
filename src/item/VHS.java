package item;

public class VHS extends Midia {

    //#region Atributos/Constantes

    private String sTitulo;

    //#endregion

    //#region Constructor

    public VHS(int iCodigo, String sDescricao, String sGravadora, float fDuracao, String sTitulo) {
        super(iCodigo, sDescricao, sGravadora, fDuracao);
        this.setTitulo(sTitulo);
    }

    //#endregion

    //#region Getters/Setters

    public String getTitulo() {
        return this.sTitulo;
    }   

    public VHS setTitulo(String sTitulo) {
        this.sTitulo = sTitulo;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString =  new StringBuilder();
        oString.append(super.toString())
            .append("Titulo: ")
            .append(this.getTitulo())
            .append("/n");
        return oString.toString();
    }

    //#endregion

}

