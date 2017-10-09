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
@Table(name = "tab_os")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class OS {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OS_ID")
	@SequenceGenerator(name = "OS_ID", sequenceName = "SEQ_OS", allocationSize = 1)
	private Integer codigo;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Funcionario funcionario;
	
	@Column(nullable = false)
	private Cliente cliente;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
