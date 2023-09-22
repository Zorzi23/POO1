package nave_espacial;

public class MilleniumFalcon extends Apollo11 {

    //#region Atributos/Constantes

    private float fClasseHiperpropulsor;

    //#endregion

    //#region Getters/Setters

    public float getClasseHiperpropulsor() {
        return this.fClasseHiperpropulsor;
    }

    public MilleniumFalcon setClasseHiperpropulsor(float fClasseHiperpropulsor) {
        this.fClasseHiperpropulsor = fClasseHiperpropulsor;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Classe Hiperpropulsor:")
            .append(this.getClasseHiperpropulsor());
        return oString.toString();
    }

    //#endregion

}
