// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.BibidiBoilet;

public class BibidiBoiletSigma extends Command {
  BibidiBoilet m_bibidiBoilet;
  double m_output;
  
  /** Creates a new BibidiBoiletSigma. */
  public BibidiBoiletSigma(BibidiBoilet bibidiBoilet, double output) {
    m_bibidiBoilet = bibidiBoilet; 
    m_output = output;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_bibidiBoilet.setPercentOutput(m_output);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_bibidiBoilet.setPercentOutput(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
