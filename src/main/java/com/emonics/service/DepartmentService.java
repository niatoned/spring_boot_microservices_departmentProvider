package com.emonics.service;

import com.emonics.entity.Department;
import com.emonics.error.DepartmentNotFoundException;

public interface DepartmentService {
	Department saveDepartment(Department department);
	Department findDepartmentById(Long departmentId) throws DepartmentNotFoundException;
}
