package modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tab_pessoas")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
abstract class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PESSOA_ID")
	@SequenceGenerator(name = "PESSOA_ID", sequenceName = "SEQ_PESSOA", allocationSize = 1)
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(name="cpf_cnpj", length = 14, unique=true, nullable = false)
	private String cpfCnpj;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpfCnpj=" + cpfCnpj + "]";
	}

}
