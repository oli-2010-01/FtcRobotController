package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class buttonMap {
    public boolean Zero = true;

    public double rightFrontMotorPower = 0;
    public double rightBackMotorPower = 0;
    public double leftFrontMotorPower = 0;
    public double leftBackMotorPower = 0;

    public void loop(robot Robot, OpMode opMode) {
        if (opMode.gamepad1.right_bumper) {
            leftFrontMotorPower = 0.8;
            leftBackMotorPower = 0.8;
            rightBackMotorPower = 0.8;
            rightFrontMotorPower = 0.8;
        }
        if (opMode.gamepad1.left_bumper) {
            leftFrontMotorPower = -0.8;
            leftBackMotorPower = -0.8;
            rightBackMotorPower = -0.8;
            rightFrontMotorPower = -0.8;
        }
        if (opMode.gamepad1.dpad_left) {
            if (opMode.gamepad1.dpad_up) {
                leftFrontMotorPower = 0;
                leftBackMotorPower = 0.8;
                rightBackMotorPower = 0;
                rightFrontMotorPower = 0.8;
            }
            else if (opMode.gamepad1.dpad_down){
                leftFrontMotorPower = -0.8;
                leftBackMotorPower = 0;
                rightBackMotorPower = -0.8;
                rightFrontMotorPower = 0;
            }
            else {
                leftFrontMotorPower = -0.8;
                leftBackMotorPower = 0.8;
                rightBackMotorPower = -0.8;
                rightFrontMotorPower = 0.8;
            }

        }
        if (opMode.gamepad1.dpad_right) {
            if (opMode.gamepad1.dpad_up) {
                leftFrontMotorPower = 0.8;
                leftBackMotorPower = 0;
                rightBackMotorPower = 0.8;
                rightFrontMotorPower = 0;
            } else if (opMode.gamepad1.dpad_down) {
                leftFrontMotorPower = 0;
                leftBackMotorPower = -0.8;
                rightBackMotorPower = 0;
                rightFrontMotorPower = -0.8;
            } else {
                leftFrontMotorPower = 0.8;
                leftBackMotorPower = -0.8;
                rightBackMotorPower = 0.8;
                rightFrontMotorPower = -0.8;
            }
        }

        if (opMode.gamepad1.right_trigger_pressed) {
            leftFrontMotorPower = -opMode.gamepad1.right_trigger;
            leftBackMotorPower = -opMode.gamepad1.right_trigger;
            rightBackMotorPower = opMode.gamepad1.right_trigger;
            rightFrontMotorPower = opMode.gamepad1.right_trigger;
        }
        if (opMode.gamepad1.left_trigger_pressed) {
            leftFrontMotorPower = opMode.gamepad1.left_trigger;
            leftBackMotorPower = opMode.gamepad1.left_trigger;
            rightBackMotorPower = -opMode.gamepad1.left_trigger;
            rightFrontMotorPower = -opMode.gamepad1.left_trigger;
        }
        if (opMode.gamepad1.a) {
            leftFrontMotorPower *= 0.8;
            leftBackMotorPower *= 0.8;
            rightBackMotorPower *= 0.8;
            rightFrontMotorPower *= 0.8;
        }
        if (opMode.gamepad1.b) {

            if (Zero) {

                Robot.left_Front.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
                Robot.left_Back.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
                Robot.right_Back.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
                Robot.right_Front.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
                Zero = false;
            }
            else {
                Robot.left_Front.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
                Robot.left_Back.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
                Robot.right_Back.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
                Robot.right_Front.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
                Zero = true;
            }

        }

        Robot.left_Front.setPower(leftFrontMotorPower);
        Robot.left_Back.setPower(leftBackMotorPower);
        Robot.right_Front.setPower(rightFrontMotorPower);
        Robot.right_Back.setPower(rightBackMotorPower);
        leftFrontMotorPower = 0;
        leftBackMotorPower = 0;
        rightFrontMotorPower = 0;
        rightBackMotorPower = 0;

        }
    }

