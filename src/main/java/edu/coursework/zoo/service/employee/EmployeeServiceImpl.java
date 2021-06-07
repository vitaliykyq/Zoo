package edu.coursework.zoo.service.employee;

import edu.coursework.zoo.model.Cleaner;
import edu.coursework.zoo.model.Employee;
import edu.coursework.zoo.repository.cleaner.CleanerRepository;
import edu.coursework.zoo.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public Employee getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Employee create(Employee employee) {

        employee.setCreated_at(new Date());
        return repository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {

        employee.setModified_at(new Date());
        return repository.save(employee);
    }

    @Override
    public Employee delete(String id) {

        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }
}
