package br.edu.infnet.votaelberthmoraes.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
	name = "TEleicao",
	uniqueConstraints =  
		@UniqueConstraint(columnNames={"descricao"})	
)
public class Eleicao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime data;
	private String descricao;
	@Transient
	private List<Candidato> candidato;
	@Transient
	private List<Voto> votos;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Eleicao() {
		this.setData(LocalDateTime.now());
	}
	
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Candidato> getCandidato() {
		return candidato;
	}
	public void setCandidato(List<Candidato> candidato) {
		this.candidato = candidato;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
}
