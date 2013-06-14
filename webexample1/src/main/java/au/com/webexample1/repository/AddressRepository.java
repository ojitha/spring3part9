package au.com.webexample1.repository;

import org.springframework.data.repository.CrudRepository;

import au.com.webexample1.domain.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
