package au.com.webexample1.repository;

import org.springframework.data.repository.CrudRepository;

import au.com.webexample1.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
