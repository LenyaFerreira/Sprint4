package com.exercicio.spring.controladora.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.exercicio.spring.classe.Partido;
import com.exercicio.spring.classe.enu.IdeologiaEnum;

public class PartidoDto {
	
	private Long id;
	private String nome;
	private String sigla;
	private IdeologiaEnum ideologia;
	private LocalDate dataDeFundacao;
	
	
	
	
	public PartidoDto(Partido partido) {
		this.id = partido.getId();
		this.nome = partido.getNome();
		this.sigla = partido.getSigla();
		this.ideologia = partido.getIdeologia();
		this.dataDeFundacao = partido.getDataFundacao();
	}

	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public IdeologiaEnum getIdeologia() {
		return ideologia;
	}
	public void setIdeologia(IdeologiaEnum ideologia) {
		this.ideologia = ideologia;
	}
	public LocalDate getDataDeFundacao() {
		return dataDeFundacao;
	}
	public void setDataDeFundacao(LocalDate dataDeFundacao) {
		this.dataDeFundacao = dataDeFundacao;
	}

	public static List<PartidoDto> converter(List<Partido> partidos) {

		return partidos.stream().map(PartidoDto::new).collect(Collectors.toList());
	}
	
	
	
	
	
	
	
	

}
