package org.usfirst.frc.team5996.robot.subsystems;

import org.usfirst.frc.team5996.robot.RobotMap;
import org.usfirst.frc.team5996.robot.commands.MoveDartControlled_Command;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Dart_Subsystem extends Subsystem {
	
	Victor dartLeft = RobotMap.dartLeft;
	Victor dartRight = RobotMap.dartRight;
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new MoveDartControlled_Command());
	}
	
	public void startDart(double speed) {
		dartLeft.set(speed);
		dartRight.set(speed);
	}
	
	public void stopDart() {
		dartLeft.set(0);
		dartRight.set(0);
	}
}
