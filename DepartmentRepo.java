package com.example.demo.repository;

import com.example.demo.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends CrudRepository<Department,Integer> {
}
