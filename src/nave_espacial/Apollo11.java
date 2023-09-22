package nave_espacial;

public class Apollo11 extends NaveEspacial {
    
    //#region Atributos/Constantes

    private String sTipoCombustivel;

    //#endregion

    //#region Getters/Setters

    public String getTipoCombustivel() {
        return this.sTipoCombustivel;
    }

    public Apollo11 setTipoCombustivel(String sTipoCombustivel) {
        this.sTipoCombustivel = sTipoCombustivel;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Tipo Combustivel:")
            .append(this.getTipoCombustivel());
        return oString.toString();
    }

    //#endregion

}
