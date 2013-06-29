package au.com.webexample1.service;

import java.util.List;

import au.com.webexample1.domain.Address;

public interface AddressService {
	public List<Address> findAll();
	public void save(Address address);

}
