package au.com.webexample1.service;

import java.util.List;

import au.com.webexample1.domain.State;

public interface StateService {
	public void save(State state);
	public List<State> findAll();

}
