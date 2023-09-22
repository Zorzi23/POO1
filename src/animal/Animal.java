package animal;

public class Animal {

    //#region Atributos/Constantes

    private int iMembros;

    //#endregion

    //#region Getters/Setters

    public int getMembros() {
        return this.iMembros;
    }

    public Animal setMembros(int iMembros) {
        this.iMembros = iMembros;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append("Membros:")
            .append(this.getMembros())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}
