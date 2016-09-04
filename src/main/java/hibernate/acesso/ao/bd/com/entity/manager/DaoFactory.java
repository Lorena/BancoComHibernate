package hibernate.acesso.ao.bd.com.entity.manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class DaoFactory {

	private DaoFactory(){ }
	
	private static final String PERSISTENCE_UNIT_NAME = "nomeDoProjetoUnit";
	private static EntityManagerFactory entityManagerFactoryInstance;
	public static EntityManagerFactory entityManagerFactorInstance(){
		if(entityManagerFactoryInstance == null){
			entityManagerFactoryInstance = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return entityManagerFactoryInstance;
	}
	
	
	private static DepartmentDao departmentDaoInstance;
	public static DepartmentDao departmentInstance(){
		
		if(departmentDaoInstance == null){
			departmentDaoInstance = new DepartmentDao();
		}
		
		return departmentDaoInstance;
	}
	
	private static EmployeeDao employeeDaoInstance;
	public static EmployeeDao employeeInstance(){
		
		if(employeeDaoInstance == null){
			employeeDaoInstance = new EmployeeDao();
		}
		
		return employeeDaoInstance;
	}
	
}
