package pessoa_aluno_professor;

public class Professor extends Pessoa {

    //#region Atributos/Constantes

    private String sDisciplina;

    //#endregion

    //#region Getters/Setters

    public String getDisciplina() {
        return this.sDisciplina;
    }

    public Professor setDisciplina(String sDisciplina) {
        this.sDisciplina = sDisciplina;
        return this;
    }

    //#endregion

    //#region toString

    @Override
    public String toString() {
        StringBuilder oString = new StringBuilder();
        oString.append(super.toString())
            .append("Disciplina:")
            .append(this.getDisciplina())
            .append("\n");
        return oString.toString();
    }

    //#endregion

}
