package com.greatlearning.main;

import com.greatlearning.subclass.AdminDepartment;
import com.greatlearning.subclass.HrDepartment;
import com.greatlearning.subclass.TechDepartment;

// Define a driver class Main
public class Main {

	// Define main method
	public static void main(String[] args) {

		/*
		 * Define and initialize AdminDepartment class object admin 
		 * with AdminDepartment class reference
		 */
		AdminDepartment admin = new AdminDepartment();

		/*
		 * Define and initialize HrDepartment class object hr 
		 * with HrDepartment class reference
		 */
		HrDepartment hr = new HrDepartment();

		/*
		 * Define and initialize TechDepartment class object tech 
		 * with TechDepartment class reference
		 */
		TechDepartment tech = new TechDepartment();

		/*
		 * Displaying the functionalities of all departments(Admin, Hr, Tech) 
		 * and displaying holiday status using SuperDepartment class method 
		 * isTodayAHoliday()
		 */
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday() + "\n");

		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday() + "\n");

		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
