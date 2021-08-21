package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		
		System.out.println("Desktop Size");
	}
	
	public static void main(String args[]) {
		
		Desktop desobj = new Desktop();
		desobj.desktopSize();
		desobj.computerModels();
	}

}
