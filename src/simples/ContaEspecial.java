package simples;

public class ContaEspecial extends Conta {

    //#region Atributos/Constantes

    private int iDiasSemJuros;
    private double dLimite;

    //#endregion

    //#region Getters/Setters

    public int getDiasSemJuros() {
        return this.iDiasSemJuros;
    }

    public ContaEspecial setDiasSemJuros(int iDiasSemJuros) {
        this.iDiasSemJuros = iDiasSemJuros;
        return this;
    }

    public double getLimite() {
        return this.dLimite;
    }

    public ContaEspecial setLimite(double dLimite) {
        this.dLimite = dLimite;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Número da Conta")
            .append(this.getNumero())
            .append("\n")
            .append("Saldo")
            .append(this.getSaldo())
            .append("\n");
        return oString.toString();
    }

    //#endregion
}