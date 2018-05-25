package Basics_201;

import java.util.Scanner;

public class Locks {
	 public int password;
	 private boolean locked;
	 
	 Locks Locky = new Locks();
	 Locks Lockette = new Locks();
	 
	 public Locks() {
	     password = (int)(Math.random() * 500);
	     System.out.println(password);
	     locked = true;
			boolean JoshisCodeGod = true; {
			while(JoshisCodeGod) {
			
				 Locks Locky = new Locks();
				 Locks Lockette = new Locks();
				
			Scanner input = new Scanner(System.in);
			
			int comLocky;
			int comLockette;

			for(int i = 0; i < 2; i++) {
				if (comLocky == password) {
					System.out.println("You found the Combination!");
					break;
				}else 
					System.out.println("You Suck");	
					
											} 
			for(int i = 0; i < 2; i++) {
				if (comLockette == password) {
					System.out.println("You found the Combination!");
					break;
				}else 
					System.out.println("You Suck");	
								}
			}
		}
 }  
}
