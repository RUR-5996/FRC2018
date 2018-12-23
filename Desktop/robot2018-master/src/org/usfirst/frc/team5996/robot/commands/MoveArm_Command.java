package org.usfirst.frc.team5996.robot.commands;

import org.usfirst.frc.team5996.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveArm_Command extends Command {
	
	private double speed;
	
	public MoveArm_Command(double speed) {
		requires(Robot.arm);
		this.speed = speed;
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void execute() {
		Robot.arm.startArm(this.speed);
	}
	
	public void interrupted() {
		
		end();
	}
	
	public void end() {
		Robot.arm.stopArm();
	}
}
