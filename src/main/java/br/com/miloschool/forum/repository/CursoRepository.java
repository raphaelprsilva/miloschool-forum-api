package br.com.miloschool.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.miloschool.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

  Curso findByNome(String nomeCurso);

}
