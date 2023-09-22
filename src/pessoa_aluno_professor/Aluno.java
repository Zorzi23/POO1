package pessoa_aluno_professor;

public class Aluno extends Pessoa {
    
    //#region Atributos/Constantes

    private int iMatricula;

    //#endregion

    //#region Getters/Setters

    public int getMatricula() {
        return this.iMatricula;
    }

    public Aluno setMatricula(int iMatricula) {
        this.iMatricula = iMatricula;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Matricula:")
            .append(this.getMatricula())
            .append("\n");
        return oString.toString();
    }
    
    //#endregion

}
