package au.com.webexample1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import au.com.webexample1.domain.Address;
import au.com.webexample1.service.AddressService;

@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private AddressService addressService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model uiModel){
		
		return "user/list";
		
		
	}
	
	@ModelAttribute("allAddresses")
	public List<Address> getAllUsers(){
		return  addressService.findAll();
		
	}
	
}
