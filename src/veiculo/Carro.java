package veiculo;

public class Carro extends Veiculo {
    
    //#region Atributos/Constantes

    private int iPortas;

    //#endregion

    //#region Getters/Setters

    public int getPortas() {
        return this.iPortas;
    }

    public Carro setPortas(int iPortas) {
        this.iPortas = iPortas;
        return this;
    }


    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Portas:")
            .append(this.getPortas());
        return oString.toString();
    }    

    //#endregion
}
