/**For Operator GamePad and Controls
  *This is to be inputed into the Robot.java file for the 2017 code. This is just part of 
  *Code that needs to be added on.
  */
  
  import edu.wpi.first.wpilibj.DoubleSolenoid;
  import ca.team3161.interfaces.GearMech;
      
       LogitechDualAction OperatorPad = new LogitechDualAction(1, 50, TimeUnit.MILLISECONDS);
       registerLifecycleComponent(operatorPad);

      
      	operatorPad.bind(LogitechButton.X, gearMech::openClaw);
	operatorPad.bind(LogitechButton.X, gearMech::closeClaw);
      	operatorPad.bind(LogitechButton.B, gearMech::openFlap);
	operatorPad.bind(LogitechButton.B, gearMech::closeFlap);

		
		operatorPad.bind(LogitechButton.X, PressType.PRESS, () -> claw.set(-1));
		operatorPad.bind(LogitechButton.X, PressType.RELEASE, () -> claw.set(0));

		operatorPad.bind(LogitechButton.B, PressType.PRESS, () -> flap.set(-1));
		operatorPad.bind(LogitechButton.B, PressType.RELEASE, () -> flap.set(0));

