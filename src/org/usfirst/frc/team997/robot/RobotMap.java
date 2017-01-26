package org.usfirst.frc.team997.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

public static Encoder leftEncoder;
public static Encoder rightEncoder;
public static Gyro gyro;

public static void init() {
	final double gearRatio = 0.225;
	final double ticksPerRev = 2048;
	final double pi = 3.14;
	final double radius = 2;
	final double calculated = ((gearRatio*2*pi)/ticksPerRev)*radius;
	
	gyro = new ADXRS450_Gyro(SPI.Port.valueOf("kOnboardCS0"));
	
	leftEncoder = new Encoder(0, 1, false, EncodingType.k4X);
	leftEncoder.setDistancePerPulse(calculated);
	leftEncoder.setPIDSourceType(PIDSourceType.kRate);
	rightEncoder = new Encoder(2, 3, false, EncodingType.k4X);
	rightEncoder.setDistancePerPulse(calculated);
	rightEncoder.setPIDSourceType(PIDSourceType.kRate);
}
	
public static final int 
driveTrainLeftMotor = 0, 
driveTrainRightMotor = 1;

}
