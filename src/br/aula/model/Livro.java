package br.aula.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Livro")
public class Livro {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "titulo", nullable = true)
	private String titulo;

	@Column(name = "foto", nullable = true)
	private String foto;

	@Column(name = "quantidade")
	private Integer quantidade;

	@ManyToOne
	private Autor autorId;

	@OneToMany(mappedBy = "livroId")
	private List<Emprestimo> emprestimos = new ArrayList<>();

	@OneToMany(mappedBy = "livroId")
	private List<Review> reviews = new ArrayList<>();

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

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

}
