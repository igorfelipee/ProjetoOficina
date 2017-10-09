package modelo.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import modelo.dominio.OS;

public class OSDAO extends JpaDAO<OS> {
	
	public List<OS> list(Integer codigo) {
			
			String jpql = "from OS p";
			
			if (codigo != null)
				jpql = jpql + "  where p.codigo like :nome";
			
			jpql = jpql + "  order by p.codigo";
			
			TypedQuery<OS> comando = this.getEntityManager().createQuery(jpql, OS.class);
			
			if (codigo != null)
				comando.setParameter("nome", "%" + codigo + "%");
			
			return comando.getResultList();
		}

}
