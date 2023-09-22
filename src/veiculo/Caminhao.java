package veiculo;

public class Caminhao extends Veiculo {

    //#region Atributos/Constantes

    private int iEixos;

    //#endregion

    //#region Getters/Setters

    public int getEixos() {
        return this.iEixos;
    }

    public Caminhao setEixos(int iEixos) {
        this.iEixos = iEixos;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Eixos:")
            .append(this.getEixos());
        return oString.toString();
    }

    //#endregion

}
