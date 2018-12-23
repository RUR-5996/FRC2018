package org.usfirst.frc.team5996.robot.commands;

import org.usfirst.frc.team5996.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StartServo_Command extends Command {

	public StartServo_Command() {
		requires(Robot.camera);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void execute() {
		Robot.camera.moveServo();
			
	}
	
	protected void interrupted() {
		end();
	}
	protected void end() {
		//System.out.println(this.param);
	}

}
