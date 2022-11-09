// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

public final class Constants {

   public static class Swerve {
    // Kinematics and Odometry

    public static double kMaxVelocity = Units.feetToMeters(12.0); // In Feet Per Second (converted to meters)
    public static double kMaxAcceleration = Units.feetToMeters(6.0); // In Feet Per Second (converted to meters)

    // Module Rotation PID
    public static double kRotationPID_P = 0.0045;
    public static double kRotationPID_I = 0.0;
    public static double kRotationPID_D = 0.0001;
    public static double kRotationPID_T = 1.0;

    // Module Velocity PID
    public static double kVelocityPIDp = 0.0005;
    public static double kVelocityPIDi = 0.0;
    public static double kVelocityPIDd = 0.0001;

    // Robot Angle PID
    public static double kAnglePIDp = 0.008;
    public static double kAnglePIDi = 0.0;
    public static double kAnglePIDd = 0.001;

   // public static double kDegreesPerSecond = 180.0;
   // public static double kRotationConstant = (kDegreesPerSecond * Robot.kPeriod);
   }

   /**
     * Constants is direct reference to their location in the PDP.
     */
    public static class PdpPorts {
        public static int kHoodMotor = 0;
    }

    public static class DriveConstants {


        public static int kFrontLeftDriveMotorPort =  0;
        public static int kFrontLeftTurningMotorPort = 0;
        public static int kFrontLeftDriveEncoderReversed = 0; 
        public static int kFrontLeftTurningEncoderReversed = 0;
        public static int kFrontLeftDriveAbsoluteEncoderPort = 0;
        public static int kFrontLeftDriveAbsoluteEncoderOffsetRad = 0;
        public static int kFrontLeftDriveAbsoluteEncoderReversed = 0;
    
        public static int kFrontRightDriveMotorPort = 0;
        public static int kFrontRightTurningMotorPort = 0;
        public static int kFrontRightDriveEncoderReversed = 0; 
        public static int kFrontRightTurningEncoderReversed = 0;
        public static int kFrontRightDriveAbsoluteEncoderPort = 0;
        public static int kFrontRightDriveAbsoluteEncoderOffsetRad = 0;
        public static int kFrontRightDriveAbsoluteEncoderReversed = 0;

        public static int kBackRightDriveMotorPort = 0;
        public static int kBackRightTurningMotorPort = 0;
        public static int kBackRightDriveEncoderReversed = 0; 
        public static int kBackRightTurningEncoderReversed = 0;
        public static int kBackRightDriveAbsoluteEncoderPort = 0;
        public static int kBackRightDriveAbsoluteEncoderOffsetRad = 0;
        public static int kBackRightDriveAbsoluteEncoderReversed = 0;

        public static int kBackLeftTurningMotorPort = 0;
        public static int kBackLeftDriveMotorPort = 0;
        public static int kBackLeftDriveEncoderReversed = 0; 
        public static int kBackLeftTurningEncoderReversed = 0;
        public static int kBackLeftDriveAbsoluteEncoderPort = 0;
        public static int kBackLeftDriveAbsoluteEncoderOffsetRad = 0;
        public static int kBackLeftDriveAbsoluteEncoderReversed = 0;

        
    }


    
}