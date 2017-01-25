package org.usfirst.frc.team997.robot.subsystems;

import org.usfirst.frc.team997.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Climber extends Subsystem {
	
	private VictorSP climbMotor;
	
	public Climber(int climberMotorPort){
		
		climbMotor = new VictorSP(climberMotorPort);
		
	}
	
	public void initDefaultCommand(){
		//shouldn't run anything initially?
	}
	
//comment!
}
 