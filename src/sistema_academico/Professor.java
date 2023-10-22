package sistema_academico;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

    private List<Disciplina> leciona = new ArrayList<>();

    public Professor(String nome) {
        super(nome);
    }

    public List<Disciplina> getLeciona() {
        return leciona;
    }

    public Professor leciona(Disciplina disciplina) {
        leciona.add(disciplina);
        return this;
    }
    
}