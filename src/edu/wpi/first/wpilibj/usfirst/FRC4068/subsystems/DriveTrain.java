/*
 * @(#)DriveTrain.java 1.0 11/9/14
 * 
 * Sean Bowers
 * 
 * Copyright (c) FIRST 2008. All Rights Reserved.
 * Open Source Software - may be modified and shared by FRC teams. The code
 * must be accompanied by the FIRST BSD license file in the root directory of
 * the project.
 */

package edu.wpi.first.wpilibj.usfirst.FRC4068.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.usfirst.FRC4068.References;

public class DriveTrain {
    static Talon BL = new Talon(References.PWM_DRIVE_BL);
    static Talon BR = new Talon(References.PWM_DRIVE_BR);
    static Talon FL = new Talon(References.PWM_DRIVE_FL);
    static Talon FR = new Talon(References.PWM_DRIVE_FR);
    static RobotDrive drive = new RobotDrive(FL, BL, FR, BR);
    
    public static void drive(double move, double rotate){
        drive.arcadeDrive(move, rotate);
    }
    
    public static void setSafety(boolean state){
        drive.setSafetyEnabled(state);
    }
}
