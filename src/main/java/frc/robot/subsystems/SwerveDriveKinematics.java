package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.SwerveModuleState;

public class SwerveDriveKinematics {
    public SwerveDriveKinematics(Translation2d... wheelsMeters) {
    // Locations for the swerve drive modules relative to the robot center.
        Translation2d m_frontLeftLocation = new Translation2d(0.381, 0.381);
        Translation2d m_frontRightLocation = new Translation2d(0.381, -0.381);
        Translation2d m_backLeftLocation = new Translation2d(-0.381, 0.381);
        Translation2d m_backRightLocation = new Translation2d(-0.381, -0.381);

        // Creating my kinematics object using the module locations
        SwerveDriveKinematics m_kinematics = new SwerveDriveKinematics(
        m_frontLeftLocation, m_frontRightLocation, m_backLeftLocation, m_backRightLocation
        );
    }
    public ChassisSpeeds toChassisSpeeds​(SwerveModuleState... wheelStates) {
        // Example module states
        var frontLeftState = new SwerveModuleState(23.43, Rotation2d.fromDegrees(-140.19));
        var frontRightState = new SwerveModuleState(23.43, Rotation2d.fromDegrees(-39.81));
        var backLeftState = new SwerveModuleState(54.08, Rotation2d.fromDegrees(-109.44));
        var backRightState = new SwerveModuleState(54.08, Rotation2d.fromDegrees(-70.56));

        // Convert to chassis speeds
        ChassisSpeeds chassisSpeeds = kinematics.toChassisSpeeds(
        frontLeftState, frontRightState, backLeftState, backRightState);

        // Getting individual speeds
        double forward = chassisSpeeds.vxMetersPerSecond;
        double sideways = chassisSpeeds.vyMetersPerSecond;
        double angular = chassisSpeeds.omegaRadiansPerSecond;
    }
    public SwerveModuleState[] toSwerveModuleStates​(ChassisSpeeds chassisSpeeds,
        Translation2d centerOfRotationMeters) {
            // Example chassis speeds: 1 meter per second forward, 3 meters
            // per second to the left, and rotation at 1.5 radians per second
            // counterclockwise.
        ChassisSpeeds speeds = new ChassisSpeeds(1.0, 3.0, 1.5);

            // Convert to module states
        SwerveModuleState[] moduleStates = kinematics.toSwerveModuleStates(speeds);

            // Front left module state
        SwerveModuleState frontLeft = moduleStates[0];

            // Front right module state
        SwerveModuleState frontRight = moduleStates[1];

            // Back left module state
        SwerveModuleState backLeft = moduleStates[2];

            // Back right module state
        SwerveModuleState backRight = moduleStates[3];
    }
    // The desired field relative speed here is 2 meters per second
    // toward the opponent's alliance station wall, and 2 meters per
    // second toward the left field boundary. The desired rotation
    // is a quarter of a rotation per second counterclockwise. The current
    // robot angle is 45 degrees.
    ChassisSpeeds speeds = ChassisSpeeds.fromFieldRelativeSpeeds(
    2.0, 2.0, Math.PI / 2.0, Rotation2d.fromDegrees(45.0));
  
    // Now use this in our kinematics
    SwerveModuleState[] moduleStates = kinematics.toSwerveModuleStates(speeds);
}
