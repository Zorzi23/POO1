package atendimento_medico;

public class Medico extends Cliente {
    
    private Especialidade eEspecialidade;

    public Medico(String sNome, Especialidade eEspecialidade) {
        super(sNome);
        this.setEspecialidade(eEspecialidade);
    }

    public Especialidade getEspecialidade() {
        return this.eEspecialidade;
    }

    public Medico setEspecialidade(Especialidade eEspecialidade) {
        this.eEspecialidade = eEspecialidade;
        return this;
    }

}
