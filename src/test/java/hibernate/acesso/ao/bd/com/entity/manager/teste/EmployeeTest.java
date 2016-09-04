package hibernate.acesso.ao.bd.com.entity.manager.teste;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import hibernate.acesso.ao.bd.com.entity.manager.DaoFactory;
import hibernate.acesso.ao.bd.com.entity.manager.Department;
import hibernate.acesso.ao.bd.com.entity.manager.Employee;
import hibernate.acesso.ao.bd.com.entity.manager.EmployeeDao;
 

public class EmployeeTest {

	private EmployeeDao employeeDao = DaoFactory.employeeInstance();

	
	@Test
	public void findEmployeeByDepartamentTest(){
		
		Department department = new Department((long) 1);
		List<Employee> employees = employeeDao.findEmployeeByDepartament(department);
		assertEquals(3, employees.size());

	}
	
}
