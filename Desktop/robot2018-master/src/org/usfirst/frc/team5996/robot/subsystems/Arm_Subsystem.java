package org.usfirst.frc.team5996.robot.subsystems;

import org.usfirst.frc.team5996.robot.RobotMap;
import org.usfirst.frc.team5996.robot.commands.MoveArmController_Command;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm_Subsystem extends Subsystem {
	
	Victor arm = RobotMap.arm;
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new MoveArmController_Command());
	}
	
	public void startArm(double speed) {
		arm.set(speed);
	}
	
	public void stopArm() {
		arm.set(0);
	}
	
}
