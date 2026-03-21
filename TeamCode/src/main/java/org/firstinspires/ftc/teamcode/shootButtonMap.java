package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class shootButtonMap {
    public double intake1MotorPower = 0;

    public double intake2MotorPower = 0;

    public double shootMotorVelocity = 0;

    public double targetVelocity = 0;

    public void loop(robot Robot, OpMode opMode) {
        shootMotorVelocity = Robot.shootMotor.getVelocity();
        if(opMode.gamepad2.a) {
            intake1MotorPower = 0.8;
        }
        //check again for the issue of it never stopping
        if(opMode.gamepad2.b) {
            intake2MotorPower = 0.8;
        }
        //check again for the issue of it never stopping
        if(opMode.gamepad2.right_bumper) {
            targetVelocity = 2000;
        }
        if(opMode.gamepad2.left_bumper) {
            intake1MotorPower = 0.8;
            targetVelocity = 2000;
        }
        if(Math.abs(shootMotorVelocity - targetVelocity) <= 100) {
            intake2MotorPower = 0.8;
            intake1MotorPower = 0.8;
        }
        opMode.telemetry.addLine("shootMotorVelocity"+ shootMotorVelocity);

        Robot.intakeMotor1.setPower(intake1MotorPower);
        intake1MotorPower = 0;
        Robot.intakeMotor2.setPower(intake2MotorPower);
        intake2MotorPower = 0;
        Robot.shootMotor.setVelocity(targetVelocity);
        targetVelocity = 0;

    }
}


