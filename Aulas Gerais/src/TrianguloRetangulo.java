public class TrianguloRetangulo {
    
    //#region Atributos

    private double dBase = 0;
    private double dAltura = 0;
    private double dHipotenusa = 0;

    //#endregion

    //#region Constructor

    public TrianguloRetangulo(double dAltura, double dBase) {
        this.setAltura(dAltura);
        this.setBase(dBase);
        this.setHipotenusa(TrianguloRetangulo.calcularHipotenusa(this.getAltura(), this.getBase()));
    }

    //#endregion

    //#region Getters/Setters


    public double getBase() {
        return this.dBase;
    }

    public TrianguloRetangulo setBase(double dBase) {
        this.dBase = dBase;
        return this;
    }

    public double getAltura() {
        return this.dAltura;
    }

    public TrianguloRetangulo setAltura(double dAltura) {
        this.dAltura = dAltura;
        return this;
    }
    
    private TrianguloRetangulo setHipotenusa(double dHipotenusa) {
        this.dHipotenusa = dHipotenusa;
        return this;
    }

    public double getHipotenusa() {
        return this.dHipotenusa;
    }

    //#endregion

    //#region Métodos de Cálculo

    public static double calcularHipotenusa(double dAltura, double dBase) {

        double dSomaCatetos = Math.pow(dAltura, 2) + Math.pow(dBase, 2);

        return Math.sqrt(dSomaCatetos);
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append("Hipotenusa: ").append((float) this.getHipotenusa());
        return oString.toString();
    }

    //#endregion
}
