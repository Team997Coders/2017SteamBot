package org.usfirst.frc.team997.robot.subsystems;

import org.usfirst.frc.team997.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private Victor left;
	private Victor right;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
public void drive(double leftValue, double rightValue) {
	left.set(-leftValue);
	right.set(rightValue);
	SmartDashboard.putNumber("DriveTrain left", -leftValue);
	SmartDashboard.putNumber("DriveTrain right", rightValue);
}
public DriveTrain(){
	left = new Victor(RobotMap.driveTrainLeftMotor);
	right = new Victor(RobotMap.driveTrainRightMotor);
}
    public void initDefaultCommand() {
    
    	// Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

