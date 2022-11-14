package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    private MotorController left, right;

    public Drivetrain(int portl, int portr) {
        left = new Victor(portl);
        right = new Victor(portr);
        right.setInverted(true);
    }
    
    public void drive(double l, double r){
        left.set(l);
        right.set(r);
    }

    public void stop() {
        left.stopMotor();
        right.stopMotor();
    }
}
