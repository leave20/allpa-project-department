package com.craig.allpaprojectdepartment.repository;

import com.craig.allpaprojectdepartment.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {
    List<Department> findByCountryId(String countryId);
}
