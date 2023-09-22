package pecas_xadrez;

public class Peca {

    //#region Atributos/Constantes

    private int iLinha;
    private int iColuna;
    private boolean bCor;
    private int iMovimentos;
    
    //#endregion

    //#region Getters/Setters


    public int getLinha() {
        return this.iLinha;
    }

    public Peca setLinha(int iLinha) {
        this.iLinha = iLinha;
        return this;
    }

    public int getColuna() {
        return this.iColuna;
    }

    public Peca setColuna(int iColuna) {
        this.iColuna = iColuna;
        return this;
    }

    public boolean isColorido() {
        return this.bCor;
    }

    public Peca setCor(boolean bCor) {
        this.bCor = bCor;
        return this;
    }

    public int getMovimentos() {
        return this.iMovimentos;
    }

    public Peca setMovimentos(int iMovimentos) {
        this.iMovimentos = iMovimentos;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append("Linha:")
            .append(this.getLinha())
            .append("\n")
            .append("Coluna:")
            .append(this.getColuna())
            .append("\n")
            .append("Colorido:")
            .append(this.isColorido())
            .append("\n")
            .append("Movimentos:")
            .append(this.getMovimentos())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}
