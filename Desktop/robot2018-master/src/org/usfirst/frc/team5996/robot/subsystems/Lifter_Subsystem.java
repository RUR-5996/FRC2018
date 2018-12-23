package org.usfirst.frc.team5996.robot.subsystems;

import org.usfirst.frc.team5996.robot.Robot;
import org.usfirst.frc.team5996.robot.RobotMap;
import org.usfirst.frc.team5996.robot.commands.ControlledLifter_Command;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Lifter_Subsystem extends Subsystem {
	
	Victor lifter = RobotMap.lifter;
	public Encoder encoder;
	public static final double kDistancePerRevolution = 2 * Math.PI * 3.5;
	public static final int kPulsesPerRevolution = 490;
	public static final double kDistancePerPulse = kDistancePerRevolution / kPulsesPerRevolution;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new ControlledLifter_Command());
		
	}
	
	public void encoderInit() {
		encoder = new Encoder(1, 2, true, Encoder.EncodingType.k4X);
		encoder.setDistancePerPulse(kDistancePerPulse); 
		encoder.setMaxPeriod(0.1);		// In seconds. Specifies the time after which when no difference in value is detected the motor is turned off
		encoder.setMinRate(7);			// In distance per second. Scaled up from the value of distance per pulse. 	
	}
	
	public void setLifter(int choice) {
		SmartDashboard.putNumber("Lifter encoder", encoder.get());
		if(choice == 1) {
			if(encoder.get() < 150) {
				lifter.set(-Robot.m_oi.lifterSpeed);
			}
			else {
				lifter.set(0);
				//choice = 0;
			}
		}
		else if(choice == 2) {
			if(encoder.get() > 0) {
				lifter.set(Robot.m_oi.lifterSpeed);
			}
			else {
				lifter.set(0);
				//choice == 0;
			}
		}
		else if(choice == 0) {
			lifter.set(0);
		}
	}
	
	public void setSpeed(double speed) {
		int x = 0;
		int y = 0;
		//if(!(encoder.get() < x || encoder.get() > y))
			lifter.set(speed);
		System.out.println("Current position: " + encoder.get());
	}
	/*
	// 0 = no movement; 1 = closing; 2 = opening
			//encoder.reset();
			if(encoder.getRaw() <= 0 && controller.getAButtonPressed()) {	// Close
				choice = 1;
			}
			else if(controller.getBButtonPressed()) {		// Open
				choice = 2;
			}
			else if(controller.getYButtonPressed()) {
				choice = 0;
			}
	-----------------------------------------------------------------------------	
			if(choice == 1) {		// Closing
				if(encoder.get() < 80) {	// This number needs adjusting
					fourth.set(-0.2);
				}
				else {
					fourth.set(0);
					choice = 0;
				}
			}
			
			else if(choice == 2) {		// Opening
				if(encoder.get() > 0)
					fourth.set(0.2);
				else if(encoder.get() <= 0) {	// only else would be sufficient instead of parameter
					fourth.set(0);
					choice = 0;
				}
			}*/
	
}
