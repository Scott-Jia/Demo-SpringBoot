package com.projectbo.demo.entity;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptId;

    @NotBlank(message = "Please add department name")
//    @Email
//    @PositiveOrZero
//    @FutureOrPresent
    private String deptName;
    private String deptAddress;
    private String deptCode;

//    public Department() {
//    }
//
//    public Department(Long deptId, String deptName, String deptAddress, String deptCode) {
//        this.deptId = deptId;
//        this.deptName = deptName;
//        this.deptAddress = deptAddress;
//        this.deptCode = deptCode;
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "deptId=" + deptId +
//                ", deptName='" + deptName + '\'' +
//                ", deptAddress='" + deptAddress + '\'' +
//                ", deptCode='" + deptCode + '\'' +
//                '}';
//    }
//
//    public Long getDeptId() {
//        return deptId;
//    }
//
//    public void setDeptId(Long deptId) {
//        this.deptId = deptId;
//    }
//
//    public String getDeptName() {
//        return deptName;
//    }
//
//    public void setDeptName(String deptName) {
//        this.deptName = deptName;
//    }
//
//    public String getDeptAddress() {
//        return deptAddress;
//    }
//
//    public void setDeptAddress(String deptAddress) {
//        this.deptAddress = deptAddress;
//    }
//
//    public String getDeptCode() {
//        return deptCode;
//    }
//
//    public void setDeptCode(String deptCode) {
//        this.deptCode = deptCode;
//    }
}
