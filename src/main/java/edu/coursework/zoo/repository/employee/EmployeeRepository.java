package edu.coursework.zoo.repository.employee;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
