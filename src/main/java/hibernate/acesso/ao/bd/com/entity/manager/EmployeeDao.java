package hibernate.acesso.ao.bd.com.entity.manager;

import java.util.List;

public class EmployeeDao extends GenericDao<Employee, Long> {

	
	public List<Employee> findEmployeeByDepartament(Department department ){
		
		return (List<Employee>) executeQuery("SELECT e FROM Employee e WHERE e.department = ?0", department);
		
	}
	
}
