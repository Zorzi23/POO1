package sistema_academico;

public class Matricula {

    private Aluno aluno;
    private Disciplina disciplina;
    private Fase fase;

    public Matricula(Aluno aluno, Disciplina disciplina, Fase fase) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.fase = fase;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Fase getFase() {
        return fase;
    }
    
}
