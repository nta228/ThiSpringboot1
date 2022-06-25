package fpt.aptech.thispringboot1.service;

import fpt.aptech.thispringboot1.entity.Employee;
import fpt.aptech.thispringboot1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAllEprisee() {
        return employeeRepository.findAll();
    }
    public Employee createEprisee(Employee account) {
        return employeeRepository.save(account);
    }

}
