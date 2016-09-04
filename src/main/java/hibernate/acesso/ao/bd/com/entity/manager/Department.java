package hibernate.acesso.ao.bd.com.entity.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table
public class Department extends BaseBean {

	private static final long serialVersionUID = 2401350765920412256L;

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany(mappedBy="department",cascade=CascadeType.PERSIST)
	private List<Employee> employees = new ArrayList<Employee>();

	public Department() {
		super();
	}
	public Department(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
}