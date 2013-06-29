package au.com.webexample1;

import java.beans.PropertyEditorSupport;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import au.com.webexample1.domain.Address;
import au.com.webexample1.domain.Department;
import au.com.webexample1.domain.Employee;
import au.com.webexample1.domain.State;
import au.com.webexample1.service.DepartmentService;
import au.com.webexample1.service.EmployeeService;
import au.com.webexample1.service.StateService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private StateService stateService;
		 
	@RequestMapping(value = "/createemployee", method = RequestMethod.GET)
	public String createEmployee(Model model){ 
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employee/createemployee";
	}
	
	@ModelAttribute("allDepartments")
	public List<Department> findAllDepartments(){
		return departmentService.findAll();
	}

	@ModelAttribute("allStates")
	public List<State> findAllStates(){
		return stateService.findAll();
	}

	@RequestMapping(value="/createemployee", params={"saveEmployee"})
	public String saveEmployee(@Valid final  Employee employee, final BindingResult bindingResult){
		if (bindingResult.hasErrors()){
			return "employee/createemployee";
		}
		employeeService.save(employee);
		return "employee/createemployee";
	}
	
	
}
