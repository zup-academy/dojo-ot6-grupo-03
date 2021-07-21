package br.com.zupedu.dojo.ot4dojo.turma;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @PostMapping
    public ResponseEntity<?> criarTurma(@Valid @RequestBody TurmaRequest turmaRequest){

        Turma turma = turmaRequest.toModel(turmaRequest, turmaRepository);

    }

}
