package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.DepartmentRepo;
import com.example.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmpController {
    @Autowired
    DepartmentRepo deptRepo;
    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("/all" )
    List<Employee> all() {
        return (List<Employee>) employeeRepo.findAll();
    }
    @PostMapping(path= "/saveEmp", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee)     {
        //
     Employee e=   employeeRepo.save(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(e.getEmpId()).toUri();

        return ResponseEntity.created(location).build();

    }


}
