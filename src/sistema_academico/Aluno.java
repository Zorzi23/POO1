package sistema_academico;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    private List<Matricula> matriculas = new ArrayList<>();

    public Aluno(String nome) {
        super(nome);
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public Aluno matricular(Disciplina disciplina, Fase fase) {
        Matricula matricula = new Matricula(this, disciplina, fase);
        matriculas.add(matricula);
        return this;
    }
    
}