package com.rogerjemployee.springbootbackend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rogerjemployee.springbootbackend.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeSpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringbootBackendApplication.class, args);
	}

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
//		  Employee employee = new Employee(); employee.setFirstName("Roger");
//		  employee.setLastName("Jimenez"); employee.setEmailId("rogersaya@gmail.com");
//		  employeeRepository.save(employee);
//		  
//		  Employee employee1 = new Employee(); employee1.setFirstName("Sara");
//		  employee1.setLastName("Connor");
//		  employee1.setEmailId("Terminator@gmail.com");
//		  employeeRepository.save(employee1);
		 
	}


}
