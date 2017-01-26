package org.usfirst.frc.team997.robot.subsystems;

import org.usfirst.frc.team997.robot.RobotMap;
import org.usfirst.frc.team997.robot.commands.Drive;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private Victor left;
	private Victor right;
	private Encoder leftEncoder = RobotMap.leftEncoder;
	private Encoder rightEncoder = RobotMap.rightEncoder;
	private final ADXRS450_Gyro gyro = new ADXRS450_Gyro(SPI.Port.valueOf("kOnboardCS0"));
	
	double pasterr = 0.01D;
	double integral = 0.0D;
	double speed = 0.0D;
	
	double rotpasterr = 0;
	double rotintegral = 0;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
public void drive(double leftValue, double rightValue) {
	left.set(-leftValue);
	right.set(rightValue);
	SmartDashboard.putNumber("DriveTrain left", -leftValue);
	SmartDashboard.putNumber("DriveTrain right", rightValue);
}

public void driveToDistance(double setPoint) {
	while(leftEncoder.getDistance() <= setPoint) {
		double kpe = 0.5/setPoint;
		double error = setPoint-leftEncoder.getDistance();
		double derivative = error - pasterr;
		pasterr = error;
		speed = (kpe*error) + (0*integral) + (0*derivative);
		
		if(error > 0.01) {
			integral = 0.0D;
		} else {integral += error;}
		
		double kpg = 0.06;
		double angle = RobotMap.gyro.getAngle();
		
		speed = Math.min(Math.max(speed, 0.5D), -0.5D);
		drive(speed, -kpg*angle);
		
		Timer.delay(0.004);
	}
	
}
public void rotateToAngle(double angle) {
	while(Math.abs(RobotMap.gyro.getAngle()) <= Math.abs(angle)) {
		double maxSpeed = 0.25;
		double currentAngle = RobotMap.gyro.getAngle();
		double kpr = maxSpeed/angle;
		double roterr = angle-currentAngle;
		double kdr = kpr-rotpasterr;
		rotpasterr = roterr;
		
		double curve = (kpr*roterr) + (0*rotintegral) + (5*kdr);
		
		if(roterr > 0.01) {
			rotintegral = 0.0D;
		} else {rotintegral += roterr;}
		
		curve = Math.min(Math.max(curve,  maxSpeed), -maxSpeed);
		
		if(angle > 0) {
			drive(-curve, -curve);
		} else {
			drive(curve, curve);
		}
	}
}


public DriveTrain(){
	left = new Victor(RobotMap.driveTrainLeftMotor);
	right = new Victor(RobotMap.driveTrainRightMotor);
	//leftEncoder = new Encoder(RobotMap.leftEncoder);
	//rightEncoder = new Encoder(RobotMap.rightEncoder);
	
}
    
public void initDefaultCommand() {
    
    	setDefaultCommand(new Drive());
    	// Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    
}

