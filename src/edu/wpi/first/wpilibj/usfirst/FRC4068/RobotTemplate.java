/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.usfirst.FRC4068;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.usfirst.FRC4068.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.usfirst.FRC4068.subsystems.DStation;

public class RobotTemplate extends SimpleRobot {

    public void autonomous() {
        while(isAutonomous() && isEnabled()){
            
        }
    }
    public void operatorControl() {
        while(isOperatorControl() && isEnabled()){
            DriveTrain.drive(DStation.driver.getRawAxis(1), DStation.driver.getRawAxis(2), true);
        }
    }
    public void test() {
        while(isTest() && isEnabled()){
            
        }
    }
    
    
}
