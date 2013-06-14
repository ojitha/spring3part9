package au.com.webexample1;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import au.com.webexample1.domain.State;
import au.com.webexample1.service.StateService;

@Controller
public class StateController {

	@Autowired
	private StateService stateSerivce;
	
	@RequestMapping(value="/state", params={"save"})
	public String save(@Valid final  State state, final BindingResult bindingResult){
		if (bindingResult.hasErrors()){
			return "state/state";
		}
		this.stateSerivce.save(state);
		return "state/state";
	}
	
	@RequestMapping(value = "/state", method = RequestMethod.GET)
	public String state(final  State state){ 
		return "state/state";
	}
	
	@ModelAttribute("allStates")
	public List<State> getAllStates(){
		return this.stateSerivce.findAll();
	}

}
