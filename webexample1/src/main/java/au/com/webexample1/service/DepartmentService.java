package au.com.webexample1.service;

import java.util.List;

import au.com.webexample1.domain.Department;

public interface DepartmentService {
	public List<Department> findAll();
	public Department findById(Integer id);
}
