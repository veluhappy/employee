package com.employee.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee.modal.EmployeeDetails;
import com.employee.service.EmployeeService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@RestController
public class EmployeeResource {
	
	@Autowired
	public EmployeeService employeeService;
	
	
	private static final int EmployeeDetails = 0;

	@PostMapping(value = "/api/saveEmployee")
	public ResponseEntity<List<EmployeeDetails>> saveEmloyee(@RequestBody List<EmployeeDetails> request){
		
		System.out.println("Inside Controller");
		
		return employeeService.saveEmployee(request);
		
	}

}
