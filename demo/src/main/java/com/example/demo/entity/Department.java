package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long DepartmentId;
    private String DepartmentName;
    private String DepartmentAddress;
    private String DepartmentCode;

    public long getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(long departmentId) {
        DepartmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return DepartmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        DepartmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }

    public Department(long departmentId, String departmentName, String departmentAddress, String departmentCode) {
        DepartmentId = departmentId;
        DepartmentName = departmentName;
        DepartmentAddress = departmentAddress;
        DepartmentCode = departmentCode;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentId=" + DepartmentId +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", DepartmentAddress='" + DepartmentAddress + '\'' +
                ", DepartmentCode='" + DepartmentCode + '\'' +
                '}';
    }
}
