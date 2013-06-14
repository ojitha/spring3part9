package au.com.webexample1.service.jpa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.webexample1.domain.Department;
import au.com.webexample1.repository.DepartmentRepository;
import au.com.webexample1.service.DepartmentService;

@Service("departmentService")
@Transactional
@Repository
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentService;
	
	@Override
	@Transactional
	public List<Department> findAll() {
		List<Department> departments = new ArrayList<Department>();
		Iterator<Department> it = departmentService.findAll().iterator();
		while(it.hasNext()){
			departments.add(it.next());
		}
		return departments;
	}

	@Override
	public Department findById(Integer id) {
		return this.departmentService.findOne(id);
	}
	
	

}
