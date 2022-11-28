package com.exercicio.spring.controladora.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.exercicio.spring.classe.Associado;
import com.exercicio.spring.classe.Partido;
import com.exercicio.spring.classe.enu.CargoPoliticoEnum;import com.exercicio.spring.classe.enu.SexoEnum;

public class AssociadoDto {
	
	private Long id;
	private String nome;
	private CargoPoliticoEnum cargoPolitico; 
	private LocalDate dataDeNascimento;
	private SexoEnum sexo;
	//private Partido partido;
	
	
	public AssociadoDto (Associado associado) {
		this.id = associado.getId();
		this.nome = associado.getNome();
		this.cargoPolitico = associado.getCargoPolitico();
		this.dataDeNascimento = associado.getDataDeNascimento();
		this.sexo = associado.getSexo();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public CargoPoliticoEnum getCargoPolitico() {
		return cargoPolitico;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public SexoEnum getSexo() {
		return sexo;
	}

	public static List<AssociadoDto> converter(List<Associado> associados) {
		return associados.stream().map(AssociadoDto::new).collect(Collectors.toList());
	}

	
	
	

}
