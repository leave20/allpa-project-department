package com.craig.allpaprojectdepartment.controller;

import com.craig.allpaprojectdepartment.model.Department;
import com.craig.allpaprojectdepartment.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentServiceImpl departmentService;


    @Autowired
    public DepartmentController(DepartmentServiceImpl departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<Department>> getAll() {

        List<Department> list = departmentService.getAll();

        if (list.isEmpty())
            return ResponseEntity.noContent().build();

        return ResponseEntity.ok(list);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") String id) {

        Department department = departmentService.getDepartmentById(id);

        if (department == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(department);
    }

    @GetMapping(path = "/country/{countryId}")
    public ResponseEntity<List<Department>> getDepartmentByCountryId(@PathVariable("countryId") String countryId) {

        List<Department> departments = departmentService.findByCountryId(countryId);

        if (departments.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(departments);
    }

    @PostMapping(path = "/create")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        Department department1 = departmentService.createDepartment(department);
        return ResponseEntity.ok(department1);
    }

    @PatchMapping(path = "/update")
    public ResponseEntity<Department> updateDepartment(Department department) {
        Department department1 = departmentService.updateDepartment(department);
        if (department1 == null)
            return null;
        return ResponseEntity.ok(department1);
    }

    @GetMapping(path = "/delete/{id}")
    public ResponseEntity<Department> deleteDepartment(@PathVariable("id") String id) {
        Department department = departmentService.deleteDepartment(id);
        if (department == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(department);
    }
}
