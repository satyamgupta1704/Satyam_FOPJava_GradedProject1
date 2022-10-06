package com.greatlearning.subclass;

import com.greatlearning.superclass.SuperDepartment;

// Define a subclass TechDepartment which extends SuperDepartment
public class TechDepartment extends SuperDepartment {

	// Define TechDepartment method to return department name
	public String departmentName() {
		return "Tech Department";
	}

	// Define TechDepartment method to return today's work
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	// Define TechDepartment method to return work deadline
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	// Define TechDepartment method to return tech stack information
	public String getTechStackInformation() {
		return "Core Java";
	}

}
