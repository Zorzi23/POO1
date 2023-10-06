package atendimento_medico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ControllerTriagem {
    
    private List<Triagem> aTriagem;

    public ControllerTriagem() {
        aTriagem = new ArrayList<>();
    }

    public void adicionarTriagem(Triagem triagem) {
        aTriagem.add(triagem);
    }

    public List<Triagem> getTriagens() {
        return aTriagem;
    }

    public void ordenarPorPrioridade() {
        Collections.sort(aTriagem, new Comparator<Triagem>() {
            @Override
            public int compare(Triagem triagem1, Triagem triagem2) {
                return triagem1.getPrioridade().compareTo(triagem2.getPrioridade());
            }
        });
    }

    public Atendimento atenderProximoPaciente() {
        if (!aTriagem.isEmpty()) {
            Triagem proximaTriagem = aTriagem.get(0);
            aTriagem.remove(0);
            Cliente cliente = proximaTriagem.getCliente();
            Medico medico = new Medico("Medico", Especialidade.CLINICO_GERAL);
            Atendimento atendimento = new Atendimento(cliente, medico);
            atendimento.setDataInicio(new Date());
            
            return atendimento;
        }
        return null; // Retorna null se não houver pacientes na triagem
    }

}
