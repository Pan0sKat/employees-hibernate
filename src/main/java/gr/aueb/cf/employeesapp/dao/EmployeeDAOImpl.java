/**
 * 
 */
package gr.aueb.cf.employeesapp.dao;

import java.util.List;

import gr.aueb.cf.employeesapp.model.Employee;
import gr.aueb.cf.employeesapp.service.util.JPAHelper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Root;

/**
 * @author P.Katopis
 *
 */
public class EmployeeDAOImpl implements IEmployeeDAO {

	@Override
	public void insert(Employee employee) {
		EntityManager em = getEntityManager();
		em.persist(employee);
	}

	@Override
	public void delete(Employee employee) {
		EntityManager em = getEntityManager();
		Employee employeeToDelete = em.find(Employee.class, employee.getId()); 
		em.remove(employeeToDelete);
	}

	@Override
	public void update(Employee employee) {
		getEntityManager().merge(employee);
		
	}

	@Override
	public List<Employee> getEmployeesByLastname(String surname) {
		// Create Criteria Builder instance
		CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
				
		// Define what is returned
		CriteriaQuery<Employee> selectQuery = builder.createQuery(Employee.class);
				
		// Define FROM clause
		Root<Employee> root = selectQuery.from(Employee.class);
		
		// Avoiding SQL Injection
		ParameterExpression<String> val = builder.parameter(String.class, "employeeLastname");
				
		selectQuery.select(root).where(builder.like(root.get("lastname"), val));
				
		TypedQuery<Employee> query = getEntityManager().createQuery(selectQuery).setParameter("employeeLastname", surname + "%");
		return query.getResultList();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return getEntityManager().find(Employee.class, id);
	}
	
	private EntityManager getEntityManager() {
		return JPAHelper.getEntityManager();
	}

}
