package hibernate.acesso.ao.bd.com.entity.manager.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import hibernate.acesso.ao.bd.com.entity.manager.DaoFactory;
import hibernate.acesso.ao.bd.com.entity.manager.Department;
import hibernate.acesso.ao.bd.com.entity.manager.DepartmentDao;
import hibernate.acesso.ao.bd.com.entity.manager.Employee;
import hibernate.acesso.ao.bd.com.entity.manager.EmployeeDao;
 

public class DepartmentTest {

	private DepartmentDao departmentDao = DaoFactory.departmentInstance();
	private EmployeeDao employeeDao = DaoFactory.employeeInstance();

	
	@Test
	public void findAllTest(){
		Department dpt1 = new Department("Leandro");
		this.departmentDao.save(dpt1);
		
		this.employeeDao.save(new Employee("Lorena", dpt1));
		this.employeeDao.save(new Employee("Ludmilla", dpt1));
		this.employeeDao.save(new Employee("Larissa", dpt1));
		
		List<Department> departments = this.departmentDao.findAll();
		Employee e = this.employeeDao.findById((long) 2);
		System.out.println(e);
		
		assertEquals(1, departments.size());
	}
	
}
