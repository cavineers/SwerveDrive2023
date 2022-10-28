package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import frc.robot.subsystems.SwerveDriveKinematics;

public class SwerveModuleState {
    public int compareTo​(SwerveModuleState other) {
        
    }
    public String toString(){
        
    }
    public static SwerveModuleState optimize​(SwerveModuleState desiredState,
Rotation2d currentAngle) {
        var frontLeftOptimized = SwerveModuleState.optimize(frontLeft,
            new Rotation2d(m_turningEncoder.getDistance()));
    }
}
