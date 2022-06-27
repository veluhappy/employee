package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.modal.EmployeeDetails;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository employeeRepository;

	 public ResponseEntity<List<EmployeeDetails>> saveEmployee(List<EmployeeDetails> emp){
		 
		 if(emp!=null) {
			for(EmployeeDetails req: emp) {
				
				int num = employeeRepository.saveEmployee(req);
				System.out.println("num========>"+num);
			}
		 }
		 else {
			return new ResponseEntity<>(emp, HttpStatus.BAD_REQUEST); 
		 }
		 
		 return new ResponseEntity<>(emp, HttpStatus.CREATED);
	 }
}
