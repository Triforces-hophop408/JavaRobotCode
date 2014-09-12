/*
 * @(#)Claws.java 1.0 11/9/14
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
import edu.wpi.first.wpilibj.usfirst.FRC4068.References;

public class Claws {
    static Talon openClose = new Talon(References.PWM_CLAWS_OPEN);
    static Talon raiseLower = new Talon(References.PWM_CLAWS_RAISE);
    
    public static void setOpenClose(double speed){
        openClose.set(speed);
    }
    
    public static void setRaiseLower(double speed){
        raiseLower.set(speed);
    }
    
    public static void setSafety(boolean state){
        openClose.setSafetyEnabled(state);
        raiseLower.setSafetyEnabled(state);
    }
}
