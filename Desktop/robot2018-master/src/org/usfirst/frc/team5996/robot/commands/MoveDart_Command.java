package org.usfirst.frc.team5996.robot.commands;

import org.usfirst.frc.team5996.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveDart_Command extends Command {

	private double speed;
	
	public MoveDart_Command(double speed) {
		this.speed = speed;
		requires(Robot.dartSubsystem);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void execute() {
		Robot.dartSubsystem.startDart(this.speed);
	}
	
	public void interrupted() {
		Robot.dartSubsystem.stopDart();
	}
	
	public void end() {
		Robot.dartSubsystem.stopDart();
	}
}
