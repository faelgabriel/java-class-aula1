package br.aula.teste;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.aula.model.Livro;

public class ListandoOsLivros {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		Session s = sessionFactory.openSession();

		// Lista todos os livros;
		Query query = s.createQuery("from Livro");

		// Lista o livro baseado no ID do autor;
		// Query query = s.createQuery("from Livro l where l.autor.id = :id ");
		// query.setLong("id", 1);

		List<Livro> livros = query.list();
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
		}
	}
}
