package com.craig.allpaprojectdepartment.service;

import com.craig.allpaprojectdepartment.model.Department;
import com.craig.allpaprojectdepartment.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl implements IDepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(String id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department deleteDepartment(String id) {
        return departmentRepository.findById(id).map(department -> {
            departmentRepository.delete(department);
            return department;
        }).orElse(null);
    }

    @Override
    public List<Department> findByCountryId(String countryId) {
        return departmentRepository.findByCountryId(countryId);
    }
}

