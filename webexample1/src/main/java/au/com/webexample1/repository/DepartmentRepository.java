package au.com.webexample1.repository;

import org.springframework.data.repository.CrudRepository;

import au.com.webexample1.domain.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
