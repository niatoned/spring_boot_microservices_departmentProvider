package com.emonics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emonics.entity.Department;
import com.emonics.error.DepartmentNotFoundException;
import com.emonics.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public Department findDepartmentById(Long departmentId) throws DepartmentNotFoundException {
		return departmentRepository.findById(departmentId)
				.orElseThrow(() -> new DepartmentNotFoundException("Department is not available"));
	}

}
