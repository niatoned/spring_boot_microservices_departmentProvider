package com.emonics.error;

public class DepartmentNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DepartmentNotFoundException(String msn) {
		super(msn);
	}
}
