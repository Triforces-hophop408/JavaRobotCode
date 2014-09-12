/*
 * @(#)DStation.java 1.0 11/9/14
 * 
 * Sean Bowers
 * 
 * Copyright (c) FIRST 2008. All Rights Reserved.
 * Open Source Software - may be modified and shared by FRC teams. The code
 * must be accompanied by the FIRST BSD license file in the root directory of
 * the project.
 */

package edu.wpi.first.wpilibj.usfirst.FRC4068.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.usfirst.FRC4068.*;

public class DStation {
    static Joystick driver = new Joystick(References.USB_DRIVER);
    static Joystick coDriver = new Joystick(References.USB_CODRIVER);
    
    public static boolean[] getButtonsDriver(){
        boolean[] buttons = new boolean[12];
        for (int i = 0; i<buttons.length; i++){
            buttons[i] =  driver.getRawButton(i);
        }
        return buttons;
    }
    
    public static boolean[] getButtonsCoDriver(){
        boolean[] buttons = new boolean[12];
        for (int i = 0; i<buttons.length; i++){
            buttons[i] =  coDriver.getRawButton(i);
        }
        return buttons;
    }
    
    public static double getAxisDriver(int axis){
        return driver.getRawAxis(axis);
    }
    
}
