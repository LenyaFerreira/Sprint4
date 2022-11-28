package com.exercicio.spring.controladora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.spring.classe.Associado;
import com.exercicio.spring.controladora.dto.AssociadoDto;
import com.exercicio.spring.repositorio.AssociadoRepositorio;

@RestController
public class ControladoraAssociado {
	
	@Autowired
	private AssociadoRepositorio associadoRepositorio;
	
	@RequestMapping("/associados")
	public List<AssociadoDto> lista() {
		List<Associado> associados = associadoRepositorio.findAll();
		
	return AssociadoDto.converter(associados);
	}

}
