import java.util.Date;
import java.util.Scanner;
import atendimento_medico.*;

public class App {

    public static void main(String[] args) {
        ControllerTriagem triagemController = new ControllerTriagem();
        Scanner scanner = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Cliente 1", new Date());
        Cliente cliente2 = new Cliente("Cliente 2", new Date());
        Cliente cliente3 = new Cliente("Cliente 3", new Date());

        Triagem triagem1 = new Triagem(cliente1, Prioridade.EMERGENCIA, new Date(), new Questionario(10, "Dor intensa", false, null, null, ""));
        Triagem triagem2 = new Triagem(cliente2, Prioridade.MUITO_URGENTE, new Date(), new Questionario(8, "Dor moderada", true, null, null, ""));
        Triagem triagem3 = new Triagem(cliente3, Prioridade.URGENTE, new Date(), new Questionario(6, "Dor leve", false, null, null, ""));

        triagemController.adicionarTriagem(triagem1);
        triagemController.adicionarTriagem(triagem2);
        triagemController.adicionarTriagem(triagem3);

        triagemController.ordenarPorPrioridade();

        while (!triagemController.getTriagens().isEmpty()) {
            Triagem proximaTriagem = triagemController.getTriagens().get(0);
            System.out.println("Atendendo próximo paciente: " + proximaTriagem.getCliente().getNome());

            Atendimento atendimento = triagemController.atenderProximoPaciente();
            if (atendimento != null) {
                System.out.print("Deseja emitir um atestado para " + atendimento.getCliente().getNome() + "? (Sim ou Não): ");
                String escolha = scanner.nextLine().trim().toLowerCase();
                if (escolha.equals("sim")) {
                    atendimento.setEmiteAtestado(true);
                    System.out.println("Atestado emitido para " + atendimento.getCliente().getNome());
                }
            }
        }

        System.out.println("Todos os pacientes foram atendidos.");
        scanner.close();
    }
}
