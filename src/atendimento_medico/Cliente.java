package atendimento_medico;

import java.util.Date;

public class Cliente {
    
    private String sNome;
    private Date oDataNascimento;

    public Cliente(String sNome, Date oDataNascimento) {
        this.setNome(sNome);
        this.setDataNascimento(oDataNascimento);
    }

    public Cliente(String sNome) {
        this.setNome(sNome);
    }

    public String getNome() {
        return this.sNome;
    }

    public Cliente setNome(String sNome) {
        this.sNome = sNome;
        return this;
    }

    public Date getDataNascimento() {
        return this.oDataNascimento;
    }

    public Cliente setDataNascimento(Date oDataNascimento) {
        this.oDataNascimento = oDataNascimento;
        return this;
    }

}
