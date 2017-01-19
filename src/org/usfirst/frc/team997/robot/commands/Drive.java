package org.usfirst.frc.team997.robot.commands;

import org.usfirst.frc.team997.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends Command {

	public static boolean isArcadeDrive = false;
    public Drive() {
     requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (isArcadeDrive){
    		double leftY = Robot.oi.getLeftY();
    		double rightX = Robot.oi.getRightX();
    		Robot.driveTrain.drive(leftY + rightX, leftY - rightX);
    	}
    	else {
    		double leftY = Robot.oi.getLeftY();
    		double rightY = Robot.oi.getRightY();
    		Robot.driveTrain.drive(leftY, rightY);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
