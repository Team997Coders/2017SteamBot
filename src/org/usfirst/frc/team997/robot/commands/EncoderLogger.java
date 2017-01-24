package org.usfirst.frc.team997.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

/**
 *
 */
public class EncoderLogger extends Command {
	
	final String path = "/home/lvuser"; // warning: TOTAL GUESS - change as necessary/desired
	File logFile;
	FileWriter logFW;
	BufferedWriter logBW;
	Timer timer = new Timer();

    public EncoderLogger() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    	try {
			logFile = new File(path + "data-log.txt");
			logFile.createNewFile();
			logFW = new FileWriter(logFile);
			logBW = new BufferedWriter(logFW);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    	
    	timer.reset();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if (timer.get() % 200 == 0){
			try {
				logBW.write("Encoder speed goes here");
			} catch (IOException e) {
				e.printStackTrace();
			} 
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
