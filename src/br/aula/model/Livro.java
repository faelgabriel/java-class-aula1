package br.aula.model;

import javax.persistence.*;

public class Livro {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String titulo;
	
	private String foto;
	
	private Integer quantidade;
	
	private Autor autorId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Autor getAutorId() {
		return autorId;
	}

	public void setAutorId(Autor autorId) {
		this.autorId = autorId;
	}

}
