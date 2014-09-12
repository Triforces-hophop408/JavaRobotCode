/*
 * @(#)Launcher.java 1.0 11/9/14
 * 
 * Sean Bowers
 * 
 * Copyright (c) FIRST 2008. All Rights Reserved.
 * Open Source Software - may be modified and shared by FRC teams. The code
 * must be accompanied by the FIRST BSD license file in the root directory of
 * the project.
 */


package edu.wpi.first.wpilibj.usfirst.FRC4068.subsystems;

import edu.wpi.first.wpilibj.usfirst.FRC4068.*;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Launcher {
    static Compressor compressor = new Compressor(References.PWM_PRESSURE_SWITCH, References.PWM_COMPRESSOR_RELAY);
    static DoubleSolenoid launcher = new DoubleSolenoid(References.PWM_LAUNCHER_FORWARD, References.PWM_LAUNCHER_REVERSE);
    
    public static void startCompressor(){
        compressor.start();
    }
    
    public static void launchLauncher(){
        launcher.set(DoubleSolenoid.Value.kForward);
    }
    
    public static void retractLauncher(){
        launcher.set(DoubleSolenoid.Value.kReverse);
    }
}
