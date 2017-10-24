/**For Operator GamePad and Controls
	  *This is to be inputed into the Robot.java file for the 2017 code. This is just part of 
	  *Code that needs to be added on.
	  */

		import edu.wpi.first.wpilibj.DoubleSolenoid;
		import ca.team3161.interfaces.GearMech;
		
		DoubleSolenoid claw = new DoubleSolenoid (1,2);
		DoubleSolenoid flap = new DoubleSolenoid (3,4);
		GearMech gearMech = new GearMech(claw, flap);
	      
		LogitechDualAction operatorpad = new LogitechDualAction(1, 50, TimeUnit.MILLISECONDS);
		registerLifecycleComponent(operatorpad);

	      
		operatorpad.bind(LogitechButton.X, PressType.PRESS, gearMech::openClaw);
		operatorpad.bind(LogitechButton.X, PressType.RELEASE, gearMech::closeClaw);
		operatorpad.bind(LogitechButton.B, PressType.PRESS, gearMech::openFlap);
		operatorpad.bind(LogitechButton.B, PressType.RELEASE, gearMech::closeFlap);

