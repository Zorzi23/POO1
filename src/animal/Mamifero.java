package animal;

public class Mamifero extends Animal {
    
    //#region Atributos/Constantes

    private Enum eTipoPelo;

    //#endregion

    //#region Getters/Setters

    public Enum getTipoPelo() {
        return this.eTipoPelo;
    }

    public Mamifero setTipoPelo(Enum eTipoPelo) {
        this.eTipoPelo = eTipoPelo;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Tipo do Pelo:")
            .append(this.getTipoPelo())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}
