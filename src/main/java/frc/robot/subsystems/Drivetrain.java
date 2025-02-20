package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    MotorController left;
    MotorController right;
    public Drivetrain() {
        left = new Victor(7);
        right = new Victor(9);
    }
    public void drive (double leftSpeed, double rightSpeed) {
        left.set(leftSpeed);
        right.set(rightSpeed);
    }
    public void stop(){
    left.stopMotor();
    right.stopMotor();
    }
}