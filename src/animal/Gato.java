package animal;

public class Gato extends Mamifero {
    
    //#region Atributos/Constantes

    private Enum eRaca;

    //#endregion

    //#region Getters/Setters

    public Enum getRaca() {
        return this.eRaca;
    }

    public Gato setRaca(Enum eRaca) {
        this.eRaca = eRaca;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Raça:")
            .append(this.getRaca())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}
