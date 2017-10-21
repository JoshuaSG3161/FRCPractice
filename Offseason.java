package offseaon.java;

/** This is for the 2017 code package. Thiscode is not on github
 * I randomly created a package and when i know what the package name is, 
 * i will fix it then
 */

	import edu.wpi.first.wpilibj.DoubleSolenoid;


	/**Making new class and indetifying new Varibles
	*/


	public class Offseaon {
	  private static final Gear INSTANCE = new Gear();
	  
	  /**Making The Pneumatics start in rest mode
	  */
	  
	  private volatile boolean out = false;
	  private volatile boolean in = false;

		/**Classifying where the solenoids will be in PCM
	    */
		
		private final DoubleSoleniod Claw = new DoubleSolenoid(1, 2);
		private final DoubleSolonoid Flap = new DoubelSolenoid(3, 4);

		

		{
	        Flap.set(DoubleSolenoid.Value.kOff);
	        Claw.set(DoubleSolenoid.Value.kOff);
		boolean disabled = true;
		}

	    /**
	     * Release the Falp
	     */
	    private void pullFlap() {
	        Flap.set(DoubleSolenoid.Value.kForward);
	    }

	    /**
	     * Set the Flap back in
	     */
	    private void returnFlap() {
	        Flap.set(DoubleSolenoid.Value.kReverse);
	    }

	    /**
	     * Open the Claw
	     */
	    public void openClaw() {
	        Claw.set(DoubleSolenoid.Value.kForward);
	    }

	    /**
	     * Close the Claw
	     */
	    public void closeClaw() {
	        Claw.set(DoubleSolenoid.Value.kReverse);
	    }
		
	}
