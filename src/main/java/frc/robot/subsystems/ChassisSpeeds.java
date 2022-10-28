package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;

public class ChassisSpeeds {
    
    public ChassisSpeeds(double d, double e, double pi) {
    // The robot is moving at 3 meters per second forward, 2 meters
    // per second to the right, and rotating at half a rotation per
    // second counterclockwise.
    var speeds = new ChassisSpeeds(3.0, -2.0, Math.PI);
    }

    public static ChassisSpeeds fromFieldRelativeSpeeds​(double vxMetersPerSecond,double vyMetersPerSecond,
    double omegaRadiansPerSecond,Rotation2d robotAngle) {
        // The desired field relative speed here is 2 meters per second
        // toward the opponent's alliance station wall, and 2 meters per
        // second toward the left field boundary. The desired rotation
        // is a quarter of a rotation per second counterclockwise. The current
        // robot angle is 45 degrees.
        ChassisSpeeds speeds = ChassisSpeeds.fromFieldRelativeSpeeds​(
        2.0, 2.0, Math.PI / 2.0, Rotation2d.fromDegrees(45.0));
        return null;
    }
}
