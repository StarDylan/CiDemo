package org.usfirst.frc.team1294.robot.commands;

import org.usfirst.frc.team1294.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDriveWithJoystick extends Command{

	public ArcadeDriveWithJoystick() {
		 requires(Robot.driveTrain);
	}
	protected void execute() {
    		Robot.driveTrain.arcade(Robot.oi.getStickLeft());
    	}
	@Override
	protected void initialize() {

    	}
	@Override
	protected boolean isFinished() {
		return false;
	}
	@Override
	protected void end() {
		Robot.driveTrain.stop();	// for safety
	}
	@Override
	protected void interrupted() {
		end();
	}

}
