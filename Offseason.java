package offseaon.java;

import edu.wpi.first.wpilibj.DoubleSolenoid;

	/** This is for the 2017 code package. Thiscode is not on github
	 * I randomly created a package and when i know what the package name is, 
	 * i will fix it then
	 */

public class GearMech {

			/**Classifying where the solenoids will be in PCM
		    */
			
			public final DoubleSoleniod claw = new DoubleSolenoid(1, 2);
			public final DoubleSolonoid flap = new DoubelSolenoid(3, 4);

			{
		        flap.set(DoubleSolenoid.Value.kOff);
		        claw.set(DoubleSolenoid.Value.kOff);
			boolean disabled = true;
			}

		    /**
		     * Release the Falp
		     */
		    public void pullflap() {
		        flap.set(DoubleSolenoid.Value.kForward);
		    }

		    /**
		     * Set the Flap back in
		     */
		    public void returnflap() {
		        flap.set(DoubleSolenoid.Value.kReverse);
		    }

		    /**
		     * Open the Claw
		     */
		    public void openclaw() {
		        claw.set(DoubleSolenoid.Value.kForward);
		    }

		    /**
		     * Close the Claw
		     */
		    public void closeclaw() {
		        claw.set(DoubleSolenoid.Value.kReverse);
		    }
			
		}
