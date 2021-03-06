package br.com.zupedu.dojo.ot4dojo.turma;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class TurmaRequest {

    @Size(max = 50)
    private String nome;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    
    public String getNome() {
		return nome;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public TurmaRequest() {
    }

    public TurmaRequest(String nome, LocalDateTime dataInicio, LocalDateTime dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Turma toModel() {
       return new Turma(this.nome, this.dataInicio, this.dataFim);
    }
}
