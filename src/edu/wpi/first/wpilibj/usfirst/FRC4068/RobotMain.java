/*
 * @(#)RobotTemplate.java 1.0 11/9/14
 * 
 * Sean Bowers
 * 
 * Copyright (c) FIRST 2008. All Rights Reserved.
 * Open Source Software - may be modified and shared by FRC teams. The code
 * must be accompanied by the FIRST BSD license file in the root directory of
 * the project.
 */

package edu.wpi.first.wpilibj.usfirst.FRC4068;

import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.usfirst.FRC4068.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotMain extends SimpleRobot {
    References refs = new References();
    
    public void robotInit(){
        
    }
    
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        Launcher.startCompressor();
        DriveTrain.setSafety(true);
        Claws.setSafety(true);
        double claws = 0;
        boolean holdClaws = false;
        while (isOperatorControl() && isEnabled()){
            DriveTrain.drive(DStation.getAxisDriver(1), -(DStation.getAxisDriver(2)));
            
            boolean[] coDriverButtons = DStation.getButtonsCoDriver();
            
            if(coDriverButtons[1]){
                Launcher.launchLauncher();
            }else if(coDriverButtons[3]){
                Launcher.retractLauncher();
            }
            
            boolean[] driverButtons = DStation.getButtonsDriver();
            
            if(driverButtons[2]){
                Claws.setOpenClose(1);
            }else if(driverButtons[3]){
                Claws.setOpenClose(-1);
            }
            
            if(!holdClaws) claws = DStation.getAxisDriver(3);
            if(driverButtons[1]){
                holdClaws = !holdClaws;
            }
            System.out.println(claws);
            Claws.setRaiseLower(claws);
            
        }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
    
    public boolean isTeleop() {
        return (isOperatorControl() && isEnabled());
    }
    
}
