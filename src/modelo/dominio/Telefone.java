package modelo.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tab_telefones")
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TELEFONE_ID")
	@SequenceGenerator(name = "TELEFONE_ID", sequenceName = "SEQ_TELEFONE", allocationSize = 1)
	private Integer id;
	
	private String ddd;
	private String numero;
	private Cliente cliente;
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

}
