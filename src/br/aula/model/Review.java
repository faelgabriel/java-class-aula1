package br.aula.model;

import javax.persistence.*;

@Entity
public class Review {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "avaliacao")
	private Integer avaliacao;

	@Column(name = "comentario", nullable = true)
	private String comentario;

	@ManyToOne
	private Livro livroId;

	@ManyToOne
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
