package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TurmaRepository extends JpaRepository<Turma, Integer> {


    Optional<Turma> findByNome(String nome);

	Boolean existsByNome(String nome);
}
