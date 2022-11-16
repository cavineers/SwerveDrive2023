// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

public static class CANIds {
        public static int DriveTrainMotorLeft1  = 1;  // Left 1
        public static int DriveTrainMotorRight1 = 3;  // Right 1
        public static int DriveTrainMotorLeft2  = 2;  // Left 2
        public static int DriveTrainMotorRight2 = 4;  // Right 2

        public static int kLeftDriveMotor         = 5;
        public static int kLeftRotateMotor        = 6;
        public static int kLeftRotateEncoder      = 7;
        public static int kRightDriveMotor        = 8;
        public static int kRightRotateMotor       = 9;
        public static int kRightRotateEncoder     = 10;

    }

    public static class DriveTrain {
        public static int DriveTrainMotorLeft1 = CANIds.DriveTrainMotorLeft1;
        public static int DriveTrainMotorRight1 = CANIds.DriveTrainMotorRight1;
        public static int DriveTrainMotorLeft2 = CANIds.DriveTrainMotorLeft2;
        public static int DriveTrainMotorRight2 = CANIds.DriveTrainMotorRight2;
    }

    public static class Swerve{
        //Left 
        public static int kLeftDriveID = CANIds.kLeftDriveMotor;
        public static int kLeftRotateID = CANIds.kLeftRotateMotor;
        public static int kLeftEncoderID = CANIds.kLeftRotateEncoder;
        public static int kLeftOffset = 0; // In Degrees

        //Right 
        public static int kRightDriveID = CANIds.kRightDriveMotor;
        public static int kRightRotateID = CANIds.kRightRotateMotor;
        public static int kRightEncoderID = CANIds.kRightRotateEncoder;
        public static int kRightOffset = 0; // In Degrees
    }
}
