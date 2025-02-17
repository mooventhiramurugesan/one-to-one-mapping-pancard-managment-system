
package PanCardManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import PanCardManagementSystem.Models.Person;  

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
   
}
