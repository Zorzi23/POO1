package ambiente;

public class Cozinha extends Ambiente {
    
    //#region Atributos/Constantes

    private boolean bPossuiMicroondas;
    
    //#endregion

    //#region Getters/Setters

    public boolean isPossuiMicroondas() {
        return this.bPossuiMicroondas;
    }

    public Cozinha setPossuiMicroondas(boolean bPossuiMicroondas) {
        this.bPossuiMicroondas = bPossuiMicroondas;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Banheira:")
            .append(this.isPossuiMicroondas());
        return oString.toString();
    }

    //#endregion

}
