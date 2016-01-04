package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.commands.Reporter;
import org.usfirst.frc.team1165.wpilibj.CANTalon;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SpeedController extends ReportableSubsystem
{

	//private edu.wpi.first.wpilibj.SpeedController speedController = new CANTalon(0);
	private edu.wpi.first.wpilibj.SpeedController speedController = new Talon(0);

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		setDefaultCommand(new Reporter(this));
	}
	
	public void setSpeed(double speed)
	{
		speedController.set(speed);
	}

	@Override
	public void report()
	{
		SmartDashboard.putNumber("Cur Speed", speedController.get());
		
	}
}
