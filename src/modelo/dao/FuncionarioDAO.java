package modelo.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import modelo.dominio.Funcionario;


public class FuncionarioDAO extends JpaDAO<Funcionario> {

	public List<Funcionario> list(String nome) {
		
		String jpql = "from Funcinario p";
		
		if (nome != null || nome != "")
			jpql = jpql + "  where p.nome like :nome";
		
		jpql = jpql + "  order by p.nome";
		
		TypedQuery<Funcionario> comando = this.getEntityManager().createQuery(jpql, Funcionario.class);
		
		if (nome != null)
			comando.setParameter("nome", "%" + nome + "%");
		
		return comando.getResultList();
	}
	
}
