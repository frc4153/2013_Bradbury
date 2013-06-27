/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
//Simon's comment
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    Joystick joystickRight = new Joystick(1);
    Joystick joystickLeft = new Joystick(2);
    Joystick joystickManip = new Joystick(3);
    CANJaguar leftDrive;
    CANJaguar rightDrive;
    Compressor compressor = new Compressor (7,2);
    RobotDrive robotDrive;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
	try {
	    leftDrive = new CANJaguar(8);
	    rightDrive = new CANJaguar(4);
	    robotDrive = new RobotDrive(leftDrive, rightDrive);
	} catch (CANTimeoutException e) {
	    e.printStackTrace();
	}
	compressor.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    }
}
