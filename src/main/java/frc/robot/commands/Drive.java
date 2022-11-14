package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class Drive extends CommandBase{
    private Drivetrain drivetrain;
    private Joystick leftJ, rightJ;
    
    public Drive(Drivetrain dt, Joystick left, Joystick right) {
        this.drivetrain = dt;
        this.leftJ = left;
        this.rightJ = right;
        addRequirements(this.drivetrain);
    }

    @Override
    public void execute() {
        this.drivetrain.drive(this.leftJ.getY(), this.rightJ.getY());
    }

    public void end(boolean i) {
        this.drivetrain.stop();
    }
}
