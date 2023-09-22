package ambiente;

public class Ambiente {
    
    //#region Atributos/Constantes

    private float fArea;

    //#endregion

    //#region Getters/Setters

    public float getArea() {
        return this.fArea;
    }

    public Ambiente setArea(float fArea) {
        this.fArea = fArea;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append("Área:")
            .append(this.getArea());
        return oString.toString();
    }

    //#endregion
   
}
