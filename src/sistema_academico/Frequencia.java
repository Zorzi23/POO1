package sistema_academico;

import java.util.Date;

class Frequencia {
    private Date data;
    private Professor professor;
    private Disciplina disciplina;

    public Frequencia(Date data, Professor professor, Disciplina disciplina) {
        this.data = data;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public Date getData() {
        return data;
    }

    public Frequencia setData(Date data) {
        this.data = data;
        return this;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Frequencia setProfessor(Professor professor) {
        this.professor = professor;
        return this;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Frequencia setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
        return this;
    }
    
}