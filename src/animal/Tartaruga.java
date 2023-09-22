package animal;

public class Tartaruga extends Reptil {
    
    //#region Atributos/Constantes

    private Enum eEspecie;

    //#endregion

    //#region Getters/Setters

    public Enum getEspecie() {
        return this.eEspecie;
    }

    public Reptil setEspecie(Enum eEspecie) {
        this.eEspecie = eEspecie;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Especie:")
            .append(this.getEspecie())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}
