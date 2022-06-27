package com.employee.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.employee.modal.EmployeeDetails;

@Repository
public class EmployeeRepository {

    @Autowired 
    private JdbcTemplate jdbcTemplate;
    
    public int saveEmployee(EmployeeDetails emp){
 
    int num = jdbcTemplate.update("insert into profile.employeedetails values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", 
    	 emp.getEmpId(), emp.getFirstName(), emp.getPhoneNumber(), emp.getJoiningDate(), emp.getRelievingDate(),
    	 emp.getDesignation(), emp.getAddress(), emp.getSalary(), emp.getExperience(), emp.isTaxEnable(),
    	 emp.getTaxRate(), emp.getEmployeeStatus(), emp.getMaritalStatus(), emp.getMiddleName(), emp.getLastName());
    	
    	
    	return num;
    }
}
