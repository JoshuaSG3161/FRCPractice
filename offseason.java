package org.usfirst.frc.team3161.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**Making new class and indetifying new Varibles
*/

public class Gear extends Hopper
  private static final Gear INSTANCE = new Gear();
  
  /**Making The Pneumatics start in rest mode
  */
  
  private volatile boolean out = false;
  private volatile boolean in = flase;

	/**Classifying where the solenoids will be in PCM
    */
	
	private final DoubleSoleniod Claw = new DoubleSolenoid(1, 2);
	private final DoubleSolonoid Flap = new DoubelSolenoid(3, 4);

	public static Gear getInsatnce() {
		return INSTANCE;
}

	public void disableAll() {
        Flap.set(DoubleSolenoid.Value.kOff);
        Claw.set(DoubleSolenoid.Value.kOff);
	disabled = true;
        }
        new Thread(new Runnable() {
            public void run() {
                firing = true;
                if (!getClaw()) {
                    openClaw();
                    try {
                        Thread.sleep(125);
                    } catch (final InterruptedException e) {
                    }
                }
                pullTrigger();
                try {
                    Thread.sleep(250);
                } catch (final InterruptedException e) {
                }
                returnTrigger();
                firing = false;
            }
        }, "TRIGGER").start();
    }

    /**
     * Release the Falp
     */
    private void pullTrigger() {
        trigger.set(DoubleSolenoid.Value.kForward);
    }

    /**
     * Set the Flap back in
     */
    private void returnTrigger() {
        trigger.set(DoubleSolenoid.Value.kReverse);
    }

    /**
     * Open the roller claw
     */
    public void openClaw() {
        claw.set(DoubleSolenoid.Value.kForward);
    }

    /**
     * Close the roller claw
     */
    public void closeClaw() {
        claw.set(DoubleSolenoid.Value.kReverse);
    }

    /**
     * @return whether the claw is closed or not.
     */
    public boolean getClaw() {
return claw.get().equals(DoubleSolenoid.Value.kForward);
      
