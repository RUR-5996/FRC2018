package org.usfirst.frc.team5996.robot.commands;

import org.usfirst.frc.team5996.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StopGrab_Command extends Command {

	public StopGrab_Command(){
		requires(Robot.grabberSubsystem);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void execute() {
		Robot.grabberSubsystem.stop();
	}
}
