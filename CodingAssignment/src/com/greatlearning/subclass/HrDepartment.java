package com.greatlearning.subclass;

import com.greatlearning.superclass.SuperDepartment;

// Define a subclass HrDepartment which extends SuperDepartment
public class HrDepartment extends SuperDepartment {

	// Define HrDepartment method to return department name
	public String departmentName() {
		return "HR Department";
	}

	// Define HrDepartment method to return today's work
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	// Define HrDepartment method to return work deadline
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	// Define HrDepartment method to return activity to be done
	public String doActivity() {
		return "Team Lunch";
	}

}
