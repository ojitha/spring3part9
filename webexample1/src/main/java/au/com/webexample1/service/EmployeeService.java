package au.com.webexample1.service;

import java.util.List;

import au.com.webexample1.domain.Employee;

public interface EmployeeService {
	public void save(Employee employee);
	public List<Employee> findAll();
	

}
