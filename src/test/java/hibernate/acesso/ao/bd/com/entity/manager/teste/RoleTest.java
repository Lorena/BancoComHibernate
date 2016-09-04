package hibernate.acesso.ao.bd.com.entity.manager.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import hibernate.acesso.ao.bd.com.entity.manager.DaoFactory;
import hibernate.acesso.ao.bd.com.entity.manager.Department;
import hibernate.acesso.ao.bd.com.entity.manager.Employee;
import hibernate.acesso.ao.bd.com.entity.manager.EmployeeDao;
import hibernate.acesso.ao.bd.com.entity.manager.Role;
import hibernate.acesso.ao.bd.com.entity.manager.RoleDao;

public class RoleTest {

	private RoleDao roleDao = DaoFactory.roleInstance();

	
	@Test
	public void createRolesWithEmployeeTest(){
		
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("Maria"));
		e.add(new Employee("Marina"));
		e.add(new Employee("Mara"));
		
		roleDao.save(new Role("Programadora", e ));
		assertEquals(3, 3);

	}
	
}
