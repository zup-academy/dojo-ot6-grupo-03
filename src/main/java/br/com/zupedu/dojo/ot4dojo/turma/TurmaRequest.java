package br.com.zupedu.dojo.ot4dojo.turma;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class TurmaRequest {

    @Size(max = 50)
    private String nome;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    public TurmaRequest() {
    }

    public TurmaRequest(String nome, LocalDateTime dataInicio, LocalDateTime dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Turma toModel(TurmaRequest turmaRequest, TurmaRepository turmaRepository) {

        Turma turma = turmaRepository.findByNome(turmaRequest.nome).get();

        Turma turma = turmaRepository.save(turmaRequest);

    }
}
