// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.Drive;
import frc.robot.commands.LiftArm;
import frc.robot.commands.LowerArm;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {
  private Joystick l = new Joystick(0);
  private Joystick r = new Joystick(1);
  private Drivetrain drivetrain = new Drivetrain(1, 2);
  private Arm arm = new Arm(0);
  private Drive drive = new Drive(drivetrain, l, r);
  private LiftArm liftarm = new LiftArm(arm);
  private LowerArm lowerarm = new LowerArm(arm);
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    configureButtonBindings();
  }

  /** This function is run once each time the robot enters autonomous mode. */
  @Override
  public void autonomousInit() {
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {

  }

  /** This function is called once each time the robot enters teleoperated mode. */
  @Override
  public void teleopInit() {
    drive.schedule();
    drive.initialize();
  }
  /** This function is called periodically during teleoperated mode. */
  @Override
  public void teleopPeriodic() {
    drive.execute();
  }

  /** This function is called once each time the robot enters test mode. */
  @Override
  public void testInit() {

  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {

  }

  private void configureButtonBindings() {
    new JoystickButton(r, 2).whenActive(liftarm);
    new JoystickButton(l, 2).whenActive(lowerarm);
  }
}
