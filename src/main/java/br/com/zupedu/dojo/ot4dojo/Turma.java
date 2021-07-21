package br.com.zupedu.dojo.ot4dojo;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
public class Turma {

    public Turma(final String nome, final LocalDateTime dataInicio, final LocalDateTime dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    @NotBlank
    @NotEmpty
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
}
