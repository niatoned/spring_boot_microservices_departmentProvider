package com.emonics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emonics.entity.Department;
import com.emonics.error.DepartmentNotFoundException;
import com.emonics.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController 
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		//log.info("");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department fiingDepartmentById(@PathVariable("id") Long departmentId)
	throws DepartmentNotFoundException{
		return departmentService.findDepartmentById(departmentId);
	}

}
