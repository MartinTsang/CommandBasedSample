/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4913.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// CAN Talon Motor Controllers
	public static int RIGHT_REAR_MOTOR_PORT = 0;
	public static int LEFT_REAR_MOTOR_PORT = 1;
	public static int RIGHT_FRONT_MOTOR_PORT = 2;
	public static int LEFT_FRONT_MOTOR_PORT = 3;

	public static int GRABBER_MOTOR_PORT = 4;

	public static int VISION_INPUT_1 = 7;
	public static int VISION_INPUT_2 = 8;

	public static int XBOX_CONTROLLER_PORT = 0;
}
