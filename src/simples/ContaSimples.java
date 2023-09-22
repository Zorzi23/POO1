package simples;

public class ContaSimples extends Conta {

    //#region Atributos/Constantes

    private double dSaldoPoupanca;

    //#endregion

    //#region Getters/Setters

    public double getSaldoPoupanca() {
        return dSaldoPoupanca;
    }

    public ContaSimples setSaldoPoupanca(double dSaldoPoupanca) {
        this.dSaldoPoupanca = dSaldoPoupanca;
        return this;
    }

    //#endregion

    //#region Método de Calculo

    public ContaSimples depositoPoupanca(double dValor) {
        setSaldoPoupanca(getSaldoPoupanca() + dValor);
        return this;
    }

    public boolean saquePoupanca(double dValor) {
        if (getSaldoPoupanca() > dValor) {
            setSaldoPoupanca(getSaldoPoupanca() - dValor);
            return true;
        }
        return false;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Saldo poupança")
            .append(this.getSaldoPoupanca())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}