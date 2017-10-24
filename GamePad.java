/**For Operator GamePad and Controls
  *This is to be inputed into the Robot.java file for the 2017 code. This is just part of 
  *Code that needs to be added on.
  */

  import edu.wpi.first.wpilibj.DoubleSolenoid;
  import ca.team3161.interfaces.GearMech;
      
       LogitechDualAction operatorpad = new LogitechDualAction(1, 50, TimeUnit.MILLISECONDS);
       registerLifecycleComponent(operatorPad);

      
      	operatorPad.bind(LogitechButton.X, PressType.PRESS  gearMech::openClaw);
		operatorPad.bind(LogitechButton.X, PressType.RELEASE gearMech::cl
      	operatorPad.bind(LogitechButton.B, PressType.PRESS gearMech::openFlap);
        operatorPad.bind(LogitechButton.B, PressType.RELEASE gearMech::closeFlap)
