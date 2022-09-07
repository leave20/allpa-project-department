package com.craig.allpaprojectdepartment.service;

import com.craig.allpaprojectdepartment.model.Department;


import java.util.List;


public interface IDepartmentService {

    List<Department> getAll();

    Department getDepartmentById(String id);

    Department createDepartment(Department department);

    Department updateDepartment(Department department);

    Department deleteDepartment(String id);

    List<Department> findByCountryId(String countryId);

}
