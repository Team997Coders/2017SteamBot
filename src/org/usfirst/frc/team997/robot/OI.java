package org.usfirst.frc.team997.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
<<<<<<< HEAD

import org.usfirst.frc.team997.robot.commands.ExampleCommand;
import org.usfirst.frc.team997.robot.commands.Shoot;
=======
>>>>>>> 780319ffd78cab8aada8ddcd1fcb6077663fb1ac

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
	
<<<<<<< HEAD
	Joystick joy = new Joystick(1);
	Button shoot = new JoystickButton(joy, 1);
	
	public OI() {
		shoot.whileHeld(new Shoot());
	}
=======
	Joystick joy = new Joystick(1); //arbitrary port, change as necessary
	
	Button logButton = new JoystickButton(joy, 5); //arbitrary button, change as necessary
	
	logButton.whileHeld(new EncoderLogger());
	
>>>>>>> 780319ffd78cab8aada8ddcd1fcb6077663fb1ac
	
}
