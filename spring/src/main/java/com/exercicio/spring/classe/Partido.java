package com.exercicio.spring.classe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.exercicio.spring.classe.enu.IdeologiaEnum;

@Entity
public class Partido {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sigla;
	
	@Enumerated(EnumType.STRING)
	private IdeologiaEnum ideologia;
	
	private LocalDate dataFundacao = LocalDate.now();
	
	@OneToMany(mappedBy = "partido")
	private List<Associado> associados = new ArrayList<>();
		
	
	public Partido() {
		
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nomePartido) {
		this.nome = nomePartido;
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


	public LocalDate getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(LocalDate dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	

	
	
}
