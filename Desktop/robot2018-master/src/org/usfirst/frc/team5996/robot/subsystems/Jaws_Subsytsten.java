package org.usfirst.frc.team5996.robot.subsystems;

import org.usfirst.frc.team5996.robot.RobotMap;
import org.usfirst.frc.team5996.robot.commands.ControlledJaws_Command;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Jaws_Subsytsten extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ControlledJaws_Command());
    }
    
    public void setSpeed(double speed) {
    	RobotMap.jaws.set(speed);
    }
}

