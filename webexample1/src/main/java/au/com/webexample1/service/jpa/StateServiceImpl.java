package au.com.webexample1.service.jpa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.webexample1.domain.State;
import au.com.webexample1.repository.StateRepository;
import au.com.webexample1.service.StateService;

@Service("stateService")
@Transactional
@Repository
public class StateServiceImpl implements StateService {

	@Autowired
	StateRepository stateRepository;
	
	@Override
	public void save(State state) {
		stateRepository.save(state);

	}
	
	@Override
	public List<State> findAll(){
		Iterator<State> it = stateRepository.findAll().iterator();
		List<State> states = new ArrayList<State>();
		while(it.hasNext()){
			states.add(it.next());
		}
		return states;
	}

}
