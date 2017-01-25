package org.usfirst.frc.team997.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

<<<<<<< HEAD
import org.usfirst.frc.team997.robot.Robot;
import org.usfirst.frc.team997.robot.RobotMap;
import org.usfirst.frc.team997.robot.subsystems.Shooter;

=======
>>>>>>> 780319ffd78cab8aada8ddcd1fcb6077663fb1ac
/**
 *
 */
public class Shoot extends Command {

    public Shoot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
<<<<<<< HEAD
    	requires(Robot.shooter);
=======
>>>>>>> 780319ffd78cab8aada8ddcd1fcb6077663fb1ac
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
<<<<<<< HEAD
    	Robot.shooter.usePIDOutput(RobotMap.Values.shooterSpeed);
=======
>>>>>>> 780319ffd78cab8aada8ddcd1fcb6077663fb1ac
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
<<<<<<< HEAD
        return true;
=======
        return false;
>>>>>>> 780319ffd78cab8aada8ddcd1fcb6077663fb1ac
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
