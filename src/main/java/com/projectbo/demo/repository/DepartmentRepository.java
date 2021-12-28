package com.projectbo.demo.repository;

import com.projectbo.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDeptName(String deptName);

    public Department findByDeptNameIgnoreCase(String deptName);
}
