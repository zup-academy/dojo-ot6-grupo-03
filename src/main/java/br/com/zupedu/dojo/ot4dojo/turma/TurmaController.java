package br.com.zupedu.dojo.ot4dojo.turma;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<?> criarTurma(@Valid @RequestBody TurmaRequest turmaRequest){

        Turma turma = turmaRequest.toModel();
        boolean existeNome  = turmaRepository.existsByNome(turmaRequest.getNome());

        if(!existeNome) {
            Turma turmaresponse = turmaRepository.save(turma);
            return ResponseEntity.created(null).body(turmaresponse);
        }
        return ResponseEntity.notFound().build();
    }

}
