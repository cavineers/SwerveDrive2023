package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.SwerveModuleState;

public class SwerveDriveKinematics {

    public SwerveDriveKinematics(Translation2d... wheelsMeters) {};

    public SwerveModuleState[] toSwerveModuleStates(ChassisSpeeds speeds, Translation2d centerOfRotationMeters) {
        // Locations for the swerve drive modules relative to the robot center.
    Translation2d m_frontLeftLocation = new Translation2d(0, 0);
    Translation2d m_frontRightLocation = new Translation2d(0, -0);
    Translation2d m_backLeftLocation = new Translation2d(-0, 0);
    Translation2d m_backRightLocation = new Translation2d(-0, -0);

    // Creating my kinematics object using the module locations
    SwerveDriveKinematics m_kinematics = new SwerveDriveKinematics (m_frontLeftLocation, 
        m_frontRightLocation, m_backLeftLocation, m_backRightLocation);
        return null;
    }

    
    public ChassisSpeeds toChassisSpeeds(SwerveModuleState... wheelStates) {
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
}
