package br.aula.model;

import javax.persistence.*;

public class Review {
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer avaliacao;
	
	private String comentario;
	
	private Livro livroId;
	
	private Usuario usuarioId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Livro getLivroId() {
		return livroId;
	}

	public void setLivroId(Livro livroId) {
		this.livroId = livroId;
	}

	public Usuario getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Usuario usuarioId) {
		this.usuarioId = usuarioId;
	}

}
