package br.com.zupedu.dojo.ot4dojo.turma;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 50, unique = true)
    private String nome;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    @Deprecated
    public Turma() {
    }

    public Turma(final @NotBlank @Size(max = 50) String nome,
                 final LocalDateTime dataInicio,
                 final LocalDateTime dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Integer getId() {
        return id;
    }

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
