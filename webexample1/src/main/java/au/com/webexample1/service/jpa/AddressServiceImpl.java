package au.com.webexample1.service.jpa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.webexample1.domain.Address;
import au.com.webexample1.repository.AddressRepository;
import au.com.webexample1.service.AddressService;

@Service("addressService")
@Transactional
@Repository
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	
	@Override
	@Transactional(readOnly=true)
	public List<Address> findAll() {
		List<Address> addressList = new ArrayList<Address>();
		Iterable<Address> it = addressRepository.findAll();
		Iterator i = it.iterator();
		while (i.hasNext()){
			addressList.add((Address)i.next());
		}
		
		return addressList;
		  
	}


}
