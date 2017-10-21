package offseaon.java;

import edu.wpi.first.wpilibj.DoubleSolenoid;

	/** This is for the 2017 code package. Thiscode is not on github
	 * I randomly created a package and when i know what the package name is, 
	 * i will fix it then
	 */

public class GearMech {
	 
			public GearMech (DoubleSolenoid claw, DoubleSolenoid flap) {
			this.claw = claw;
			this.flap = flap;
			flap.set(DoubleSolenoid.Value.kOff);
		    claw.set(DoubleSolenoid.Value.kOff);
			}

			/**Classifying where the solenoids will be in PCM
		    */
			
			private final claw;
			private final flap;

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
