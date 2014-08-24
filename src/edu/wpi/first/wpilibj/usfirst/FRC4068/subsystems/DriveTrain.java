package edu.wpi.first.wpilibj.usfirst.FRC4068.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;

public class DriveTrain {
    static Talon RL = new Talon(4);
    static Talon RR = new Talon(2);
    static Talon FL = new Talon(3);
    static Talon FR = new Talon(1);
    static RobotDrive drive = new RobotDrive(FL, RL, FR, RR);
    
    public static void drive(double move, double rotate, boolean smoothIn){
        drive.arcadeDrive(move, rotate, smoothIn);
    }
}
