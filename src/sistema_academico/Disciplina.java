package sistema_academico;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private List<Professor> professores = new ArrayList<>();
    private List<Frequencia> frequencias = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Disciplina setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public Disciplina adicionarProfessor(Professor professor) {
        professores.add(professor);
        return this;
    }

    public List<Frequencia> getFrequencias() {
        return frequencias;
    }

    public Disciplina registrarFrequencia(Professor professor, Frequencia frequencia) {
        frequencia.setDisciplina(this);
        frequencia.setProfessor(professor);
        frequencias.add(frequencia);
        return this;
    }

}