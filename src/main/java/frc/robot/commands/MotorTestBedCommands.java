// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.MotorTestBedSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class MotorTestBedCommands {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final MotorTestBedSubsystem mMotorSubsys;

  public MotorTestBedCommands(MotorTestBedSubsystem subsystem) {
    super();
    mMotorSubsys = subsystem;
  }

  public class MotorOn extends CommandBase{
    @Override
    public void execute()
    {
        mMotorSubsys.turnMotorOn();;

    }
    @Override
    public boolean isFinished(){
        return true;
    }
  }

  public class MotorOff extends CommandBase{
    @Override
    public void execute()
    {
        mMotorSubsys.turnMotorOff();;

    }
    @Override
    public boolean isFinished(){
        return true;
    }
  }
}
