package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Junior
 *
 */
@Entity
@Table(name="trabalho")
public class Trabalho {
	@Id
	@GeneratedValue
	@Column(name="Tra_Id")
	private int id;
	@Column(name="Tra_Nome")
	private String nome;
	@Column(name="Tra_CargaHr")
	private int cargahr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCargahr() {
		return cargahr;
	}

	public void setCargahr(int cargahr) {
		this.cargahr = cargahr;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
