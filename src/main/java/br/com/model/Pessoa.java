package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Junior
 *
 */
@Entity
@Table(name="pessoa")
public class Pessoa {
	@Id
	@GeneratedValue
	@Column(name="Pes_Id")
	private Integer id;
	@Column(name="Pes_CPF")
	private Integer cpf;
	@Column(name="Pes_RG")
	private Integer rg;
	@Column(name="Pes_Nome")
	private String nome;
	@Column(name="Pes_SobreNome")
	private String sobrenome;
	@Column(name="Pes_email")
	private String email;
	@OneToMany
	@JoinColumn(name="Tra_Id")
	private Trabalho trabalho;


//	construtores
	public Pessoa(Integer id, Integer cpf, Integer rg, String nome, String sobrenome, String email){
		this.id = id;
		this.rg = rg;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}

	public Pessoa(){

	}

//	get e set
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Trabalho getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}
}
