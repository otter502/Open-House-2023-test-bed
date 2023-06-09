// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorTestBedConstants;

public class MotorTestBedSubsystem extends SubsystemBase {
  private CANSparkMax mMotor;
  /** Creates a new ExampleSubsystem. */
  public MotorTestBedSubsystem() {
    mMotor = new CANSparkMax(MotorTestBedConstants.kMotorID, MotorType.kBrushless);
  }

  public void turnMotorOn(){
    System.out.println("on");
    mMotor.set(MotorTestBedConstants.kSpeed);
  }
  public void turnMotorOff(){
    System.out.println("off");
    mMotor.stopMotor();
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
