package com.frameworkonly.webapp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frameworkonly.webapp.domain.Employee;
import com.frameworkonly.webapp.service.EmployeeServiceInterface;

@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan("com.frameworkonly.webapp")
public class SpringBootDemoApplication {

	@Autowired
	EmployeeServiceInterface employeeServiceInterface;
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
   
   
}

