package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.aula.model.Autor;
import br.aula.model.Livro;

public class IncluindoLivro {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		Session s = sessionFactory.openSession();

		Livro livro = new Livro();
		livro.setTitulo("O livro Master");
		Autor autor = (Autor) s.get(Autor.class, 2);
		livro.setAutorId(autor);
		livro.setQuantidade(1);
		Transaction t = s.beginTransaction();
		s.save(livro);
		t.commit();
	}
}
