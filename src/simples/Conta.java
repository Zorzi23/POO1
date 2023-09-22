package simples;

public class Conta {

    //#region Atributos/Constantes

    private String sBanco;
    private int iAgencia;
    private int iNumero;
    private double dSaldo;

    //#endregion

    //#region Getters/Setters

    public String getBanco() {
        return sBanco;
    }

    public Conta setBanco(String sBanco) {
        this.sBanco = sBanco;
        return this;
    }

    public int getAgencia() {
        return iAgencia;
    }

    public Conta setAgencia(int iAgencia) {
        this.iAgencia = iAgencia;
        return this;
    }

    public int getNumero() {
        return iNumero;
    }

    public Conta setNumero(int iNumero) {
        this.iNumero = iNumero;
        return this;
    }

    public double getSaldo() {
        return dSaldo;
    }

    public Conta setSaldo(double dSaldo) {
        this.dSaldo = dSaldo;
        return this;
    }

    //#endregion

    //#region Métodos Calculo

    public Conta deposito(double dValor) {
        return setSaldo(this.getSaldo() + dSaldo);
    }

    public boolean saque(double dValor) {
        if (getSaldo() > dValor) {
            setSaldo(getSaldo() - dValor);
            return true;
        }

        return false;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append("Banco")
            .append(this.getBanco())
            .append("\n")
            .append("Agencia")
            .append(this.getAgencia())
            .append("\n")
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