package org.usfirst.frc.team5996.robot.subsystems;

//imports
import org.usfirst.frc.team5996.robot.RobotMap;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

//declares class - Grabber_Subsystem - extends Subsystem REQUIRED!!! Cannot run otherwise. Since this is a subsystem call methods using commands.
public class Grabber_Subsystem extends Subsystem {
	
	//creates Talon objects for this subsystem using the values from RobotMap for binding. Talons are imported from wpilibj
	Victor grabWheels = RobotMap.grabberWheels;
	
	//required method by Subsystem class, do not put anything in this method for this subsystem
	protected void initDefaultCommand() {
	}
	
	/*method for starting the grabber - speed value is fed from Grab command, you can use it directly by changing speed to
	 * Robot.m_oi.grabberSpeed and deleting the parameter but I was lazy.
	 */
	public void grab(double speed) {
	   grabWheels.set(speed);
	}
	
	//method for stopping the grabber, in this case the 0 values are required as without them the grabber wouldnt stop
	public void stop() {
	   grabWheels.set(0);
	}
	
}