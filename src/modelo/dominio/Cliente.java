package modelo.dominio;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tab_clientes")
public class Cliente extends Pessoa {
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private Endereco endereco;
	
	private String email;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private Telefone telefone;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	

}
