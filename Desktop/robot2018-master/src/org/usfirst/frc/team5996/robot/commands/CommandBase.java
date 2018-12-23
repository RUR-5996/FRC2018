package org.usfirst.frc.team5996.robot.commands;

import org.usfirst.frc.team5996.robot.OI;
import org.usfirst.frc.team5996.robot.subsystems.Drive_Subsystem;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	
	public static OI oi;
	public static Drive_Subsystem drive = new Drive_Subsystem();
	
	public static void init()
	{
		oi = new OI();
	}
	
	public CommandBase(String name) {
		super(name);
	}
	
	public CommandBase() {
		super();
	}
}