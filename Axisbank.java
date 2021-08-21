package org.system;

public class Axisbank extends BankInfo {

	public void deposit() {
		
		System.out.println("Amount of rs 10000 is submitted in axis bank sucessfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Axisbank aobj= new Axisbank();
		aobj.deposit();
		aobj.savings();
		aobj.fixed();
		
	}

}
