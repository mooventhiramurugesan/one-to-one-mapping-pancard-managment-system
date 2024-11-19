package PanCardManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import PanCardManagementSystem.Models.Person;
import PanCardManagementSystem.Service.PersonService;



@Controller
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
      private PersonService personservice;
      
      @PostMapping("/savedetails")
      public ResponseEntity<Person> saveDetails(@RequestBody Person person) {
    	  Person Details=  personservice.save(person);
          return ResponseEntity.ok(Details);
      }
}
