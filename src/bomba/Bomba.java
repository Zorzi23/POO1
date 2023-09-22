package bomba;

public class Bomba {

    //#region Atributos/Constantes

    private double dTotalLitros;
    private float fValorLitro;

    //#endregion

    //#region Getters/Setters

    public double getTotalLitros() {
        return this.dTotalLitros;
    }

    public Bomba setTotalLitros(double dTotalLitros) {
        this.dTotalLitros = dTotalLitros;
        return this;
    }

    public float getValorLitro() {
        return this.fValorLitro;
    }

    public Bomba setValorLitro(float fValorLitro) {
        this.fValorLitro = fValorLitro;
        return this;
    }

    //#endregion

    //#region Métodos Auxiliares

    public boolean abastecerPorLitro(int dLitros) {
        return true;
    }

    public boolean abastecerPorValor(double dValor) {
        return true;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append("Total de Litros:")
            .append(this.getTotalLitros())
            .append("\n")
            .append("Valor Litros:")
            .append(this.getValorLitro())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}
