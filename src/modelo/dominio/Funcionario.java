package modelo.dominio;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tab_funcionarios")
public class Funcionario extends Pessoa{
	
	private String matricula;
	private String senha;
	private String tipo;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
