package Basics_201;
public class Locks {
     public int password;
     private boolean locked;
     
     Locks Locky = new Locks();
     Locks Lockette = new Locks();
     
     public Locks() {
         password = (int)(Math.random() * 500);
         System.out.println(password);
         locked = true;
     }
     
     public boolean getLocked() {
         //Returns if the lock is locked
         return this.locked;
     }
     
     public void openLock(int pass) {
         //User attepmts to unlock the lock
         if(pass == this.password) {
             //Changes boolean value inside 'this' lock
             this.locked = false;
             System.out.print("Unlocked");
           
         }
 }  
}
