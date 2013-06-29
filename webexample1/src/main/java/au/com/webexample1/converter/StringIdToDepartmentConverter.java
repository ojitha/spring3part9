package au.com.webexample1.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import au.com.webexample1.domain.Department;
import au.com.webexample1.service.DepartmentService;

public class StringIdToDepartmentConverter implements
		Converter<String, Department> {

	@Autowired
	private DepartmentService departmentService;
	
	@Override
	public Department convert(String id) {
		return this.departmentService.findById(Integer.parseInt(id));
	}

}
