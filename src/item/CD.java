package item;

public class CD extends Midia {

    //#region Atributos/Constantes

    private int iFaixas;
    private String sArtista;
    private String sAlbum;

    //#endregion

    //#region Constructor

    public CD(int iCodigo, String sDescricao, String sGravadora, float fDuracao, int iFaixas, String sArtista, String sAlbum) {
        super(iCodigo, sDescricao, sGravadora, fDuracao);
        this.setFaixas(iFaixas);
        this.setArtista(sArtista);
        this.setAlbum(sAlbum);
    }

    //#endregion

    //#region Getters/Setters


    public int getFaixas() {
        return this.iFaixas;
    }

    public CD setFaixas(int iFaixas) {
        this.iFaixas = iFaixas;
        return this;
    }

    public String getArtista() {
        return this.sArtista;
    }

    public CD setArtista(String sArtista) {
        this.sArtista = sArtista;
        return this;
    }

    public String getAlbum() {
        return this.sAlbum;
    }

    public CD setAlbum(String sAlbum) {
        this.sAlbum = sAlbum;
        return this;
    }


    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString =  new StringBuilder();
        oString.append(super.toString())
            .append("Faixas: ")
            .append(this.getFaixas())
            .append("/n")
            .append("Artista: ")
            .append(this.getArtista())
            .append("/n")
            .append("Album: ")
            .append(this.getAlbum())
            .append("/n");
        return oString.toString();
    }

    //#endregion

}

