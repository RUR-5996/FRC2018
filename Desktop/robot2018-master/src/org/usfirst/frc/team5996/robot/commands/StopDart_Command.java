package org.usfirst.frc.team5996.robot.commands;

import org.usfirst.frc.team5996.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StopDart_Command extends Command {
	public StopDart_Command() {
		requires(Robot.dartSubsystem);
	}
	

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void execute() {
		Robot.dartSubsystem.stopDart();
	}
	
	public void interrupted() {
		
	}
	
	public void end() {
		
	}
}
