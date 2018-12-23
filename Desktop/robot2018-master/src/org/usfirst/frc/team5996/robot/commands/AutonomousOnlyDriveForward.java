package org.usfirst.frc.team5996.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousOnlyDriveForward extends CommandGroup {

	public AutonomousOnlyDriveForward() {
		addSequential(new AutonomousDrive_Command(0.5), 1.5);
	}
	
}
