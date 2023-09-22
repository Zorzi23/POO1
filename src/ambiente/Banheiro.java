package ambiente;

public class Banheiro extends Ambiente {
    
    //#region Atributos/Constantes

    private boolean bPossuiBanheira;
    
    //#endregion

    //#region Getters/Setters

    public boolean isPossuiBanheira() {
        return this.bPossuiBanheira;
    }

    public Banheiro setPossuiBanheira(boolean bPossuiBanheira) {
        this.bPossuiBanheira = bPossuiBanheira;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Banheira:")
            .append(this.isPossuiBanheira());
        return oString.toString();
    }

    //#endregion

}
