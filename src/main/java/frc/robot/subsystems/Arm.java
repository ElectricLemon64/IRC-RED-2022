package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase{
    private MotorController arm;

    public Arm(int porta) {
        arm = new Victor(porta);
    }

    public void lift(double d){
        arm.set(d);
    }

    public void stop() {
        arm.stopMotor();
    }
    
}
