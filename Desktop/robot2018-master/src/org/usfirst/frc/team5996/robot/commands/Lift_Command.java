package org.usfirst.frc.team5996.robot.commands;

import org.usfirst.frc.team5996.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Lift_Command extends Command {
	
	private int input;
	
	public Lift_Command(int input) {
		requires(Robot.lifter);
		this.input = input;
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void execute() {
		Robot.lifter.setLifter(this.input);
	}
	
	public void interrupted() {
		
	}
	
	public void end() {
		
	}
}
