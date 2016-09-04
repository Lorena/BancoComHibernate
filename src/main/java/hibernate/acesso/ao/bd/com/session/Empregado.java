package hibernate.acesso.ao.bd.com.session;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Empregado {
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@ManyToOne
	private Departamento department;

	public Empregado() {}

	public Empregado(String name, Departamento department) {
		this.name = name;
		this.department = department;
	}

	public Empregado(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Departamento getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department="
				+ department.getName() + "]";
	}

}
