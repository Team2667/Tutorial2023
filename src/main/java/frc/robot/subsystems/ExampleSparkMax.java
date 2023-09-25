package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ExampleSparkMax extends SubsystemBase{
    CANSparkMax sparkMax;


    public ExampleSparkMax() {
        this.sparkMax = new CANSparkMax(Constants.exampleSparkMaxCanId, MotorType.kBrushless);
    }

    public void set(double speed) {
        sparkMax.set(speed);
    }
    
}
