package hibernate.acesso.ao.bd.com.session;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Departamento {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany(mappedBy="department",cascade=CascadeType.PERSIST)
	private List<Empregado> employees = new ArrayList<Empregado>();

	public Departamento() {
		super();
	}
	public Departamento(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Empregado> getEmployees() {
		return employees;
	}
}