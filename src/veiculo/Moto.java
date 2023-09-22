package veiculo;

public class Moto extends Veiculo {
    
    //#region Atributos/Constantes

    private int iCilindradas;

    //#endregion

    //#region Getters/Setters

    public int getCilindradas() {
        return this.iCilindradas;
    }

    public Moto setCilindradas(int iCilindradas) {
        this.iCilindradas = iCilindradas;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Cilindradas:")
            .append(this.getCilindradas());
        return oString.toString();
    }    

    //#endregion
}
