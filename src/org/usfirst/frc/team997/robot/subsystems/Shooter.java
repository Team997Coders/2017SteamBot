package org.usfirst.frc.team997.robot.subsystems;

import org.usfirst.frc.team997.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class Shooter extends PIDSubsystem {

	
	public static CANTalon shooterMotorMaster = new CANTalon(RobotMap.PDP.shooterMotorMaster);
	public static CANTalon shooterMotorSlave = new CANTalon(RobotMap.PDP.shooterMotorSlave);
	
    // Initialize your subsystem here
    public Shooter() {
        super("ShooterPID", RobotMap.Values.shooterF, RobotMap.Values.shooterP, 
        		RobotMap.Values.shooterI, RobotMap.Values.shooterD);
    	setAbsoluteTolerance(0.01);
    	
    	getPIDController().setContinuous(false);
    	
    	setSetpoint(RobotMap.Values.shooterSpeed); //-  Sets where the PID controller should move the system
                     
        enable(); //- Enables the PID controller.
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return shooterMotorMaster.getSpeed();
    }

    public void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    	shooterMotorMaster.pidWrite(output);
    }
}
