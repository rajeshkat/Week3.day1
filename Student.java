package org.student;

import org.department.Department;

public class Student extends Department   {
	
	public void studentName() {
		
		System.out.println("Student Name: Rajesh Katyal");
	}
	
	public void studentDept() {
		
		System.out.println("Student Depratment: COmputers");
	}
	
	public void studentID() {
		
		System.out.println("Student ID: 1705210");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studobj = new Student();
		studobj.collegeCOde();
		studobj.collegeName();
		studobj.collegeRank();
		studobj.deptName();
		studobj.studentName();
		studobj.studentDept();
		studobj.studentID();
	}

}
