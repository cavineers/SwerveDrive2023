package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class TeleopDrive extends CommandBase{
    private boolean m_finished = false;

    public TeleopDrive() {
        this.addRequirements();
    }

    @Override
    public void initialize() {
        
    }
}
