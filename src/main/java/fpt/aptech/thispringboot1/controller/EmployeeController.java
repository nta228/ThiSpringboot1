package fpt.aptech.thispringboot1.controller;

import fpt.aptech.thispringboot1.entity.Employee;
import fpt.aptech.thispringboot1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")

public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employee> createEprisee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.createEprisee(employee));
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> findAllEprisee() {
        return ResponseEntity.ok(employeeService.findAllEprisee());
    }


}
