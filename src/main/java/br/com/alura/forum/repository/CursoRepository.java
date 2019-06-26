package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
	
	//utilizando o padão de nomenclatura do spring data jpa
	Curso findByNome(String nome);

	
	
	
}
