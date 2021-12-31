package com.greatlearning.main;


class SuperDepartment{
	
	public String departmentName() {
		return "Super Department";
	}
	
	public String getTodaysWork() {
		return "No Work as of now.";
	}
	
	public String getWorkDeadline() {
		return "Nil"; // return
	}
	
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
	
}

class AdminDepartment extends SuperDepartment{
	
	@Override
	public String departmentName() { 
		return "Admin Department"; 
	}
	
	@Override
	public String getTodaysWork() { 
		return "Complete your Documents Submission";
	}
	
	@Override
	public String getWorkDeadline() { 
		return "Complete by EOD"; 
	}
}

class HrDepartment extends SuperDepartment {
	
	@Override
	public String departmentName() {
		return "HR Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "Team Lunch";
	}
}

class TechDepartment extends SuperDepartment{
	
	@Override
	public String departmentName() {
		return "Tech Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete Coding of Module 1";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "Core Java";
	} 
}

public class CompanyDepartment{
	public static void main(String[] arg) {
		
		AdminDepartment admin=new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		
		HrDepartment hr=new HrDepartment();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		TechDepartment tech=new TechDepartment();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();

	}
}

