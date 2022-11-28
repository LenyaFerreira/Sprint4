package com.exercicio.spring.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.spring.classe.Partido;

public interface PartidoRepositorio extends JpaRepository<Partido, Long>{

	List<Partido> findByNome(String nomePartido);
	//Partido findByNome(String nomePartido);
	

	
	
	
}
