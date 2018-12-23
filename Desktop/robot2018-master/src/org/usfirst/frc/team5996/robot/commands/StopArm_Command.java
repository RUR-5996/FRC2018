package org.usfirst.frc.team5996.robot.commands;

import org.usfirst.frc.team5996.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class StopArm_Command extends InstantCommand{

	public StopArm_Command() {
		requires(Robot.arm);
	}
	
	protected void execute() {
		Robot.arm.stopArm();
	}

}
