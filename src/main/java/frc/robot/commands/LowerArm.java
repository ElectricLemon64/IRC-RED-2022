package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class LowerArm extends CommandBase{
    private Arm arm;

    public LowerArm(Arm a) {
        this.arm = a;
        addRequirements(this.arm);
    }

    @Override
    public void execute(){
        this.arm.lift(-1);
    }

    public void end(boolean i){
        this.arm.stop();
    }
}
