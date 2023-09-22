package veiculo;

public class Veiculo {

    //#region Atributos/Constantes

    private boolean bMotorizado;

    //#endregion

    //#region Getters/Setters

    public boolean isMotorizado() {
        return this.bMotorizado;
    }

    public Veiculo setMotorizado(boolean bMotorizado) {
        this.bMotorizado = bMotorizado;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Motorizado:")
            .append(this.isMotorizado())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}