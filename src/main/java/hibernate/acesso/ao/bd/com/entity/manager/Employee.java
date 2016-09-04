package hibernate.acesso.ao.bd.com.entity.manager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee extends BaseBean {

	
	private static final long serialVersionUID = -3824201021937424471L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@ManyToOne
	private Department department;

	public Employee() {}

	public Employee(String name, Department department) {
		this.name = name;
		this.department = department;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department="
				+ department.getName() + "]";
	}

}
