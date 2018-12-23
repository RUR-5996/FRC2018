package org.usfirst.frc.team5996.robot.Sensors;

import org.usfirst.frc.team5996.robot.Robot;
import org.usfirst.frc.team5996.robot.RobotMap;
import org.usfirst.frc.team5996.robot.commands.StartServo_Command;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.StartCommand;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CameraServo_Subsystem extends Subsystem {
	
	private int upperCurrentAngle = 140;
	private int bottomCurrentAngle = 85;
	private Servo bottomServo = RobotMap.lowerServo;
	private Servo upperServo = RobotMap.upperServo;
	public int POV;
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new StartServo_Command());
		
	}
	
	/*public void setDefaultAngle() {
		bottomServo.setAngle(85);
		upperServo.setAngle(140);
	}*/
	
	public void moveServo() {
		POV = Robot.m_oi.getPOV();
		if(POV == 180) {
			if(bottomCurrentAngle < 100)
				bottomCurrentAngle++;
			bottomServo.setAngle(bottomCurrentAngle);
		}
		else if(POV == 90) {
			if(upperCurrentAngle < 155)
				upperCurrentAngle++;
			upperServo.setAngle(upperCurrentAngle);
		}
		else if(POV == 0) {
			if(bottomCurrentAngle > 70)
				bottomCurrentAngle--;
			bottomServo.setAngle(bottomCurrentAngle);
		}
		else if(POV == 270) {
			if(upperCurrentAngle > 125)
				upperCurrentAngle--;
			upperServo.setAngle(upperCurrentAngle);
		}
		
		
		
		/*if(parameter == 0) {
			if(lowerCurrentAngle < 100 && parameter == 0)
				lowerCurrentAngle++;
			//lowerServo.setAngle(lowerCurrentAngle);
			
		}
		if(parameter == 1) {
			if(lowerCurrentAngle > 70 && parameter == 1)
				lowerCurrentAngle--;
			//lowerServo.setAngle(lowerCurrentAngle);
		}
		if(parameter == 2) {
			if(upperCurrentAngle < 155 && parameter == 2)
				upperCurrentAngle++;
			//upperServo.setAngle(upperCurrentAngle);	
		}
		if(parameter == 3) {
			if(upperCurrentAngle > 115 && parameter == 4)
				upperCurrentAngle--;
			//upperServo.setAngle(upperCurrentAngle);
		}
		lowerServo.setAngle(lowerCurrentAngle);
		upperServo.setAngle(upperCurrentAngle);	
		System.out.println(parameter);
		//param = -1;
		//System.out.println(param);
		 */
	}
	
}
