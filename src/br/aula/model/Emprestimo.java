package br.aula.model;

import java.util.Date;
import javax.persistence.*;

public class Emprestimo {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date dataEmprestimo;
	
	@Temporal(TemporalType.DATE)
	private Date dataDevolucao;
	
	private Livro livroId;
	
	private Usuario usuarioId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
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
