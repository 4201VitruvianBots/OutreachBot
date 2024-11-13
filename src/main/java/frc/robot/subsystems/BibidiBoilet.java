// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BibidiBoilet extends SubsystemBase {
  /*int myVariable = 5; */
  TalonFX m_motor = new TalonFX(1); 
  double m_output = 0; 

  /** Creates a new BibidiBoilet. */
  public BibidiBoilet() {
    m_motor.getConfigurator().apply(new TalonFXConfiguration());
  }

  public void setPercentOutput(double output) {
    m_output = output;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    m_motor.set(m_output);
  }
}
