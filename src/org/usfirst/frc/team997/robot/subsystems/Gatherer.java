package org.usfirst.frc.team997.robot.subsystems;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Gatherer extends Subsystem {
	
	private VictorSP gatherMotor;
	
	public Gatherer(int gatherMotorPort){
		
		gatherMotor = new VictorSP(gatherMotorPort);
		
	}
	
//ha, ha, ha, I totally Know what I am doing.
	
	 public void initDefaultCommand() {
		 
	    }
	
}
