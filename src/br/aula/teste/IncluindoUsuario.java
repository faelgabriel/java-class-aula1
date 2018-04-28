package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.aula.model.Usuario;

public class IncluindoUsuario {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		Session s = sessionFactory.openSession();

		Usuario usuario = new Usuario();
		usuario.setUsername("rafael");
		usuario.setPassword("123456");
		usuario.setEmail("r@r.com");
		Transaction t = s.beginTransaction();
		s.save(usuario);
		t.commit();
	}
}
