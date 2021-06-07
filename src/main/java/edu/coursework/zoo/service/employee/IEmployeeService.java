package edu.coursework.zoo.service.employee;

import edu.coursework.zoo.model.Cleaner;
import edu.coursework.zoo.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee getById(String id);
    Employee create(Employee employee);
    Employee update(Employee employee);
    Employee delete(String id);
    List<Employee> getAll();
}
