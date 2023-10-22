package sistema_academico;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    private String nome;
    private List<Fase> fases = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Curso setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<Fase> getFases() {
        return fases;
    }

    public Curso adicionarFase(Fase fase) {
        fases.add(fase);
        return this;
    }

    public void listarDisciplinasOfertadas() {
        for (Fase fase : fases) {
            for (Disciplina disciplina : fase.getDisciplinas()) {
                System.out.println("Disciplina oferecida: " + disciplina.getNome());
            }
        }
    }
}
