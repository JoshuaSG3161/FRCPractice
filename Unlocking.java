package Basics_201;
import java.util.Scanner;
public class Unlocking extends Locks {
    public static void main(String[] args) {
        
                boolean JoshisCodeGod = true; {
                while(JoshisCodeGod) {
                
                     Locks Locky = new Locks();
                     Locks Lockette = new Locks();
                    
                Scanner input = new Scanner(System.in);
                
                int comLocky;
                int comLockette;
                for(int i = 0; i < 2; i++) {
                    System.out.println(i);
                    System.out.print("Please enter a number for Lock 1.... ");
                    comLocky = input.nextInt();
                    if (comLocky == password) {
                        System.out.println("You found the Combination!");
                        break;
                    }else 
                        System.out.println("You Suck");   
                        
                                                } 
                for(int i = 0; i < 2; i++) {
                    System.out.println(i);
                    System.out.print("Please enter a number for Lock 2.... ");
                    comLockette = input.nextInt();
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
