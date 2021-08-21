package org.system;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Method 1 ->Student Id: "+id);
		
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Method 2 -> Student Id: "+id+", Student Name: "+name);
	}
 
	public void getStudentInfo(String email, Long phonenumber) {
		
		System.out.println("Method 3 -> Student Email is: "+email+", Student PhoneNumber is: "+phonenumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s = new Students();
		s.getStudentInfo(10);
		s.getStudentInfo(20,"Rajesh Katyal");
		s.getStudentInfo("rajeshkatyal17@gmail.com", 7830259000L);
	}

}
