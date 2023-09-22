package ambiente;

public class Quarto extends Ambiente {
    
    //#region Atributos/Constantes

    private int iCapacidade;
    
    //#endregion

    //#region Getters/Setters

    public int getCapacidade() {
        return this.iCapacidade;
    }

    public Quarto setCapacidade(int iCapacidade) {
        this.iCapacidade = iCapacidade;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Capacidade:")
            .append(this.getCapacidade());
        return oString.toString();
    }

    //#endregion

}
