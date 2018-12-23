package org.usfirst.frc.team5996.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousRightStartToRightSwitch_Command extends CommandGroup {

	public AutonomousRightStartToRightSwitch_Command() {
		addSequential(new Jaws_Command(0.2), 0.5);
		addSequential(new AutonomousDrive_Command(0.5), 1);
		//addParallel(new MoveDart_Command(0.35), 0.5);
		addParallel(new MoveArm_Command(0.35), 0.5);
		addSequential(new Turn_Command(-90));
		addSequential(new AutonomousDrive_Command(0.5), 0.5);
		addSequential(new Jaws_Command(-0.2), 0.5);
	}
}
