package au.com.webexample1.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import au.com.webexample1.domain.State;
import au.com.webexample1.service.StateService;

public class StringCodeToStateConverter implements Converter<String, State> {
	
	@Autowired
	StateService stateService;

	@Override
	public State convert(String id) {
		return this.stateService.findById(id);
	}

}
