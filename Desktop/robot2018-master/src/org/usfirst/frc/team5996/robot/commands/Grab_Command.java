package org.usfirst.frc.team5996.robot.commands;

import org.usfirst.frc.team5996.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/*
 * Method for grabbing boxes via the grabber manipulator.
 */
public class Grab_Command extends Command {
	private double speed;
	//constructor - requires the grabber subsystem in order to function
	
	public Grab_Command(double speed){
		requires(Robot.grabberSubsystem);
		this.speed = speed;
	}
	
	//initialization code for the command
	@Override
	protected void initialize() {
		
	}
	
	//code which the command executes
	protected void execute() {
		Robot.grabberSubsystem.grab(this.speed); //sets the grabber to speed defined in OI 
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	//code to run when command ends
	@Override
	protected void end() {
		Robot.grabberSubsystem.stop();
	}
	
	//code to run when command is interrupted
	@Override
	protected void interrupted() {
		Robot.grabberSubsystem.stop();
	}
}

