package org.usfirst.frc.team997.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team997.robot.commands.ExampleCommand;
import org.usfirst.frc.team997.robot.commands.Shoot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
	//// CREATING BUTTONS
	// Button button = new JoystickButton(stick, buttonNumber);
	//// TRIGGERING COMMANDS WITH BUTTONS
	// button.whenPressed(new ExampleCommand());
	// button.whileHeld(new ExampleCommand());
	// button.whenReleased(new ExampleCommand());
	

	Joystick joy = new Joystick(1);
	Button shoot = new JoystickButton(joy, 1);
	
	public OI() {
		shoot.whileHeld(new Shoot());
	}

}
