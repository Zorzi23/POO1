package atendimento_medico;

import java.util.Date;

public class Triagem {
    
    private Cliente oCliente;
    private Prioridade ePrioridade;
    private Date oDataChegada;
    private Date oDataSaida;
    private Questionario oQuestionario;

    public Triagem(Cliente oCliente, Prioridade ePrioridade, Date oDataChegada, Questionario oQuestionario) {
        this.oCliente = oCliente;
        this.ePrioridade = ePrioridade;
        this.oDataChegada = oDataChegada;
        this.oQuestionario = oQuestionario;
    }

    public Cliente getCliente() {
        return oCliente;
    }

    public Prioridade getPrioridade() {
        return ePrioridade;
    }

    public Date getDataChegada() {
        return oDataChegada;
    }

    public Date getDataSaida() {
        return oDataSaida;
    }

    public void setDataSaida(Date oDataSaida) {
        this.oDataSaida = oDataSaida;
    }

    public Questionario getQuestionario() {
        return oQuestionario;
    }
    
}
