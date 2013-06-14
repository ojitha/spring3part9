package au.com.webexample1.repository;

import org.springframework.data.repository.CrudRepository;

import au.com.webexample1.domain.State;

public interface StateRepository extends CrudRepository<State, String> {

}
