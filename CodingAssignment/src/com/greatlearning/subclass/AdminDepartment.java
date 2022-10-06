package com.greatlearning.subclass;

import com.greatlearning.superclass.SuperDepartment;

// Define a subclass AdminDepartment which extends SuperDepartment
public class AdminDepartment extends SuperDepartment {

	// Define AdminDepartment method to return department name
	public String departmentName() {
		return "Admin Department";
	}

	// Define AdminDepartment method to return today's work
	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	// Define AdminDepartment method to return work deadline
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
