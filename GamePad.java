  /**For Operator GamePad and Controls
  *This is to be inputed into the Robot.java file for the 2017 code. This is just part of 
  *Code that needs to be added on.
  */
  
  import edu.wpi.first.wpilibj.DoubleSolenoid;
      
       LogitechDualAction OperatorPad = new LogitechDualAction(1, 50, TimeUnit.MILLISECONDS);
       registerLifecycleComponent(operatorPad);

      
      	OperatorPad.bind(LogitechButton.X, Claw::Claw);
      	OperatorPad.bind(LogitechButton.B, Flap::Flap);
