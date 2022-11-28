package com.exercicio.spring.classe;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.exercicio.spring.classe.enu.CargoPoliticoEnum;
import com.exercicio.spring.classe.enu.SexoEnum;

@Entity
public class Associado {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private CargoPoliticoEnum cargo = CargoPoliticoEnum.NENHUM;
	private LocalDate nascimento;
	
	@Enumerated(EnumType.STRING)
	private SexoEnum sexo;
	
	@ManyToOne
	private Partido partido;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CargoPoliticoEnum getCargoPolitico() {
		return cargo;
	}

	public void setCargoPolitico(CargoPoliticoEnum cargoPolitico) {
		this.cargo = cargoPolitico;
	}

	public LocalDate getDataDeNascimento() {
		return nascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.nascimento = dataDeNascimento;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
	

}
