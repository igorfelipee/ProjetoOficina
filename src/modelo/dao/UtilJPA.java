package modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilJPA {
	
	// usar a estrat�gia SINGLETON

	private UtilJPA() {
		super();
	}
	
	// criar a f�brica de EntityManager para o banco da aplica��o
	private static EntityManagerFactory fabrica = 
						Persistence.createEntityManagerFactory("banco");
	
	public static EntityManager criarEntityManager()
	{
		return fabrica.createEntityManager();
	}

}
