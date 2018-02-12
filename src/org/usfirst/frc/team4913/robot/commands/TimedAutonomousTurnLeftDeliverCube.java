package org.usfirst.frc.team4913.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4913.robot.Robot;

import static org.usfirst.frc.team4913.robot.Robot.driveSubsystem;
import static org.usfirst.frc.team4913.robot.Robot.grabbersbusytem;

@Deprecated
public class TimedAutonomousTurnLeftDeliverCube extends Command {

	Timer timer = new Timer();
	private boolean isFinished = false;

	public TimedAutonomousTurnLeftDeliverCube(Robot.TURN turnDirection) {
		requires(driveSubsystem);
		requires(grabbersbusytem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		timer.reset();
		timer.start();
	}

	protected void execute() {
		while(timer.get() < 1) {
			driveSubsystem.arcadeDrive(-1.0, 0.0); // forward
		}
		while(timer.get() >= 1 && timer.get() < 2) {
			driveSubsystem.arcadeDrive(0.0, 1.0); // turn left
		}
		while(timer.get() >= 2 && timer.get() < 4) {
			driveSubsystem.arcadeDrive(-1.0, 0.0); // 2nd forward
		}
		while(timer.get() >= 4 && timer.get() < 5) {
			driveSubsystem.arcadeDrive(0.0, -1.0); // turn right
		}
		while(timer.get() >= 5 && timer.get() < 13) {
			driveSubsystem.autoDrive();
		}
		while(timer.get() >= 13 && timer.get() < 15) {
			grabbersbusytem.releaseBlock();
		}
			isFinished = true;
		
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isFinished;
	}

	// Called once after isFinished returns true
	protected void end() {
		grabbersbusytem.stop();
		driveSubsystem.stopMotor();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
