package nave_espacial;

public class NaveEspacial {
    
    //#region Atributos/Constantes

    private double dVelocidadeMaxima;

    //#endregion

    //#region Getters/Setters

    public double getVelocidadeMaxima() {
        return this.dVelocidadeMaxima;
    }

    public NaveEspacial setVelocidadeMaxima(double dVelocidadeMaxima) {
        this.dVelocidadeMaxima = dVelocidadeMaxima;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append("Velocidade Máxima:")
            .append(this.getVelocidadeMaxima());
        return oString.toString();
    }

    //#endregion

}
