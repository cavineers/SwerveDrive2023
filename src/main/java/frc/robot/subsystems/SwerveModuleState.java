package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import frc.robot.subsystems.SwerveDriveKinematics;

public class SwerveModuleState {
    
    public SwerveModuleState[] toSwerveModuleStates(ChassisSpeeds speeds) {
        // Example chassis speeds: 1 meter per second forward, 3 meters
        // per second to the left, and rotation at 1.5 radians per second
        // counterclockwise.
        ChassisSpeeds speed = new ChassisSpeeds(1.0, 3.0, 1.5);
    
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

    private static Object optimize(SwerveModuleState swerveModuleState, Rotation2d rotation2d) {
        var frontLeftOptimized = SwerveModuleState.optimize(frontLeft,
            new Rotation2d(m_turningEncoder.getDistance()));
        return null;
    }
}
