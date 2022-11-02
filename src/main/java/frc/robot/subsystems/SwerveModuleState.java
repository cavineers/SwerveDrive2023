package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;
import java.util.Objects;

@SuppressWarnings("MemberName")
public class SwerveModuleState implements Comparable<SwerveModuleState> {
    
  public double speedMetersPerSecond;

  public Rotation2d angle = Rotation2d.fromDegrees(0);

  public SwerveModuleState() {}

  public SwerveModuleState(double speedMetersPerSecond, Rotation2d angle) {
   this.speedMetersPerSecond = speedMetersPerSecond;
       this.angle = angle;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof SwerveModuleState) {
      return Double.compare(speedMetersPerSecond, ((SwerveModuleState) obj).speedMetersPerSecond)
          == 0;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(speedMetersPerSecond);
  }

  @Override
  public int compareTo(SwerveModuleState other) {
    return Double.compare(this.speedMetersPerSecond, other.speedMetersPerSecond);
  }

  @Override
  public String toString() {
    return String.format(
        "SwerveModuleState(Speed: %.2f m/s, Angle: %s)", speedMetersPerSecond, angle);
  }

  public static SwerveModuleState optimize(
      SwerveModuleState desiredState, Rotation2d currentAngle) {
   var delta = desiredState.angle.minus(currentAngle);
       if (Math.abs(delta.getDegrees()) > 90.0) {
      return new SwerveModuleState(
          -desiredState.speedMetersPerSecond,
          desiredState.angle.rotateBy(Rotation2d.fromDegrees(180.0)));
    } else {
      return new SwerveModuleState(desiredState.speedMetersPerSecond, desiredState.angle);
    }
  }
}
