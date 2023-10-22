
import sistema_academico.*;

public class App {
    public static void main(String[] args) {
        // Criando um aluno
        Aluno aluno = new Aluno("João");
        System.out.println("Aluno criado: " + aluno.getNome());

        // Criando um professor
        Professor professor = new Professor("Maria");
        System.out.println("Professor criado: " + professor.getNome());

        // Criando um curso
        Curso curso = new Curso("Engenharia");
        System.out.println("Curso criado: " + curso.getNome());

        // Criando uma fase
        Fase fase = new Fase(1);
        System.out.println("Fase criada: " + fase.getNumero());

        // Criando disciplinas
        Disciplina disciplina1 = new Disciplina("Matemática");
        Disciplina disciplina2 = new Disciplina("Física");
        System.out.println("Disciplinas criadas: " + disciplina1.getNome() + ", " + disciplina2.getNome());

        // Associando professor às disciplinas
        disciplina1.adicionarProfessor(professor);
        disciplina2.adicionarProfessor(professor);
        System.out.println("Professor associado às disciplinas.");

        // Matriculando o aluno em disciplinas
        aluno.matricular(disciplina1, fase);
        aluno.matricular(disciplina2, fase);
        System.out.println("Aluno matriculado nas disciplinas: " + disciplina1.getNome() + ", " + disciplina2.getNome());

        // Adicionando disciplinas à fase
        fase.adicionarDisciplina(disciplina1);
        fase.adicionarDisciplina(disciplina2);
        System.out.println("Disciplinas adicionadas à fase.");

        // Adicionando a fase ao curso
        curso.adicionarFase(fase);
        System.out.println("Fase adicionada ao curso.");

        // Listando as disciplinas ofertadas no curso
        System.out.println("Disciplinas ofertadas no curso:");
        curso.listarDisciplinasOfertadas();
    }

}