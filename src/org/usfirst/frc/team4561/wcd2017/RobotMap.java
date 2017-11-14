package org.usfirst.frc.team4561.wcd2017;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Verbose
	public static final boolean DRIVETRAIN_VERBOSE = true;
	
	// Joystick configuration
	public static final double LEFT_JOYSTICK_DEAD_ZONE = 0.25;
	public static final double RIGHT_JOYSTICK_DEAD_ZONE = 0.25;
	public static final double LEFT_JOYSTICK_REDUCTION = 0.25;
	public static final double RIGHT_JOYSTICK_REDUCTION = 0.25;
	
	//Motor ports
	public static final int FRONT_RIGHT_MOTOR_PORT = 0;
	public static final int FRONT_LEFT_MOTOR_PORT = 1;
	public static final int REAR_RIGHT_MOTOR_PORT = 2;
	public static final int REAR_LEFT_MOTOR_PORT = 3;
	public static final int MID_RIGHT_MOTOR_PORT = 4;
	public static final int MID_LEFT_MOTOR_PORT = 5;
	
	//Joystick ports
	public static final int LEFT_JOYSTICK_PORT = 6;
	public static final int RIGHT_JOYSTICK_PORT = 7;
	
}
