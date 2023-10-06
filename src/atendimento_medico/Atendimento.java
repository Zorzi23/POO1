package atendimento_medico;

import java.util.Date;

public class Atendimento {
    
    private Medico oMedico;
    private Cliente oCliente;
    private Date oDataInicio;
    private Date oDataFim;
    private boolean bEmiteAtestado = false;

    public Atendimento(Cliente oCliente, Medico oMedico) {
        this.setCliente(oCliente);
        this.setMedico(oMedico);
        this.oDataInicio = new Date();
    }

    public Medico getMedico() {
        return this.oMedico;
    }

    public void setMedico(Medico oMedico) {
        this.oMedico = oMedico;
    }

    public Cliente getCliente() {
        return this.oCliente;
    }

    public void setCliente(Cliente oCliente) {
        this.oCliente = oCliente;
    }

    public Date getDataInicio() {
        return this.oDataInicio;
    }

    public void setDataInicio(Date oDataInicio) {
        this.oDataInicio = oDataInicio;
    }

    public Date getDataFim() {
        return this.oDataFim;
    }

    public void setDataFim(Date oDataFim) {
        this.oDataFim = oDataFim;
    }

    public boolean isEmiteAtestado() {
        return this.bEmiteAtestado;
    }

    public void setEmiteAtestado(boolean bEmiteAtestado) {
        this.bEmiteAtestado = bEmiteAtestado;
    }
    
}
