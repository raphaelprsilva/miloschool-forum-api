package br.com.miloschool.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.miloschool.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
