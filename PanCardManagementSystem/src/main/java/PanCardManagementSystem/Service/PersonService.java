package PanCardManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PanCardManagementSystem.Models.Person;
import PanCardManagementSystem.Repository.PersonRepository;

@Service
public class PersonService{
	
	@Autowired
	private PersonRepository personrepository;
	
	public Person save(Person person) {
		 Person details=personrepository.save(person);
		return details;
	}
}
