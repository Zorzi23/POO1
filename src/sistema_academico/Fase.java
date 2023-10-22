package sistema_academico;

import java.util.ArrayList;
import java.util.List;

public class Fase {
    private int numero;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Fase(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Fase setNumero(int numero) {
        this.numero = numero;
        return this;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Fase adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        return this;
    }

}