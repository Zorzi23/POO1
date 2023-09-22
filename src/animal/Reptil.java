package animal;

public class Reptil extends Animal {
    
    //#region Atributos/Constantes

    private Enum eTipoOvo;

    //#endregion

    //#region Getters/Setters

    public Enum getTipoOvo() {
        return this.eTipoOvo;
    }

    public Reptil setTipoOvo(Enum eTipoOvo) {
        this.eTipoOvo = eTipoOvo;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Tipo do Ovo:")
            .append(this.getTipoOvo())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}
