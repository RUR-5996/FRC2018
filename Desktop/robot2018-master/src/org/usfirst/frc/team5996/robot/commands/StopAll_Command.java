package org.usfirst.frc.team5996.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class StopAll_Command extends CommandGroup{
	public StopAll_Command() {
		addParallel(new StopDart_Command());
		addParallel(new StopGrab_Command());
		addParallel(new StopArm_Command());
	}

}
