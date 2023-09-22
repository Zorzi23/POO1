package ambiente;

public class Sala extends Ambiente {
    
    //#region Atributos/Constantes

    private boolean bPossuiTV;
    
    //#endregion

    //#region Getters/Setters

    public boolean isPossuiTV() {
        return this.bPossuiTV;
    }

    public Sala setPossuiTV(boolean bPossuiTV) {
        this.bPossuiTV = bPossuiTV;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("TV:")
            .append(this.isPossuiTV());
        return oString.toString();
    }

    //#endregion

}
