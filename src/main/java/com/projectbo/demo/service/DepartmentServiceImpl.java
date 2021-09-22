package com.projectbo.demo.service;

import com.projectbo.demo.entity.Department;
import com.projectbo.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department deptDB = departmentRepository.findById(departmentId).get();

        if (Objects.nonNull(department.getDeptName()) &&
        ! "".equalsIgnoreCase(department.getDeptName())) {

            deptDB.setDeptName(department.getDeptName());
        }

        if (Objects.nonNull(department.getDeptCode()) &&
                ! "".equalsIgnoreCase(department.getDeptCode())) {

            deptDB.setDeptCode(department.getDeptCode());
        }

        if (Objects.nonNull(department.getDeptAddress()) &&
                ! "".equalsIgnoreCase(department.getDeptAddress())) {

            deptDB.setDeptAddress(department.getDeptAddress());
        }

        return departmentRepository.save(deptDB);

    }


}
