package au.com.webexample1.service.jpa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.webexample1.domain.Employee;
import au.com.webexample1.repository.EmployeeRepository;
import au.com.webexample1.service.EmployeeService;

@Service("employeeService")
@Transactional
@Repository
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepsitory;
	
	@Transactional
	@Override
	public void save(Employee employee) {
		this.employeeRepsitory.save(employee);
	}

	@Transactional(readOnly=true)
	@Override
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<Employee>();
		Iterator<Employee> it = this.employeeRepsitory.findAll().iterator();
		while (it.hasNext()){
			employees.add(it.next());
		}
		return employees;
	}

}
