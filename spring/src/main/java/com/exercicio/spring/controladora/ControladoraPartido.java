package com.exercicio.spring.controladora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.spring.classe.Partido;
import com.exercicio.spring.controladora.dto.PartidoDto;
import com.exercicio.spring.repositorio.PartidoRepositorio;

@RestController
public class ControladoraPartido {
	
	
	@Autowired
	private PartidoRepositorio partidoRepositorio;
	
	
	@RequestMapping("/partidos")
	public List<PartidoDto> lista(String nomePartido) {
		if (nomePartido == null) {
		List<Partido> partidos = partidoRepositorio.findAll();
		return PartidoDto.converter(partidos);
		} else {
			List<Partido> partidos = partidoRepositorio.findByNome(nomePartido);
			return PartidoDto.converter(partidos);
		}
	}

}
