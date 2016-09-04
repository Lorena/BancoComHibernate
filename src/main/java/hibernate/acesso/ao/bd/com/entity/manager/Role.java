package hibernate.acesso.ao.bd.com.entity.manager;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Role extends BaseBean {

	private static final long serialVersionUID = -4569766910845814348L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

	@ManyToMany (cascade = {CascadeType.ALL})
    @JoinTable(name="roles_has_employees",
    			joinColumns={@JoinColumn(name="role_id")},
    			inverseJoinColumns={@JoinColumn(name="employee_id")})
	private List<Employee> employees;

	public Role() {}

	public Role(Long id,String name, List<Employee> employee) {
		this.id = id;
		this.name = name;
		this.employees = employee;
	}
	
	public Role(String name, List<Employee> employee) {
		this.name = name;
		this.employees = employee;
	}

	public Role(String name) {
		this.name = name;
	}
	
	public Role(Long id, List<Employee> employee) {
		this.id = id;
		this.employees = employee;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Employee> getEmployee() {
		return employees;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", employees=["
				+ employees.get(0).getName() + " ...]" + "]";
	}

}
