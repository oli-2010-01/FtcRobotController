package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class buttonMap {
    public boolean Zero = true;

    public double rightFrontMotorPower = 0;
    public double rightBackMotorPower = 0;
    public double leftFrontMotorPower = 0;
    public double leftBackMotorPower = 0;

    public double s = 0.6; // speed

    public void loop(robot Robot, OpMode opMode) {
//        if (opMode.gamepad1.right_bumper) {
//            leftFrontMotorPower = s;
//            leftBackMotorPower = s;
//            rightBackMotorPower = s;
//            rightFrontMotorPower = s;
//        }
//        if (opMode.gamepad1.left_bumper) {
//            leftFrontMotorPower = -s;
//            leftBackMotorPower = -s;
//            rightBackMotorPower = -s;
//            rightFrontMotorPower = -s;
//        }
        if (opMode.gamepad1.dpad_left) {
            if (opMode.gamepad1.dpad_up) {
                leftFrontMotorPower = 0;
                leftBackMotorPower = s;
                rightBackMotorPower = 0;
                rightFrontMotorPower = s;
            }
            else if (opMode.gamepad1.dpad_down){
                leftFrontMotorPower = -s;
                leftBackMotorPower = 0;
                rightBackMotorPower = -s;
                rightFrontMotorPower = 0;
            }
            else {
                leftFrontMotorPower = -s;
                leftBackMotorPower = s;
                rightBackMotorPower = -s;
                rightFrontMotorPower = s;
            }

        }
        if (opMode.gamepad1.dpad_right) {
            if (opMode.gamepad1.dpad_up) {
                leftFrontMotorPower = s;
                leftBackMotorPower = 0;
                rightBackMotorPower = s;
                rightFrontMotorPower = 0;
            } else if (opMode.gamepad1.dpad_down) {
                leftFrontMotorPower = 0;
                leftBackMotorPower = -s;
                rightBackMotorPower = 0;
                rightFrontMotorPower = -s;
            } else {
                leftFrontMotorPower = s;
                leftBackMotorPower = -s;
                rightBackMotorPower = s;
                rightFrontMotorPower = -s;
            }
        }
        if (!opMode.gamepad1.dpad_left && !opMode.gamepad1.dpad_right) {
            if (opMode.gamepad1.dpad_up) {
                leftFrontMotorPower = s;
                leftBackMotorPower = s;
                rightBackMotorPower = s;
                rightFrontMotorPower = s;
            }
            if (opMode.gamepad1.dpad_down) {
                leftFrontMotorPower = -s;
                leftBackMotorPower = -s;
                rightBackMotorPower = -s;
                rightFrontMotorPower = -s;
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
            leftFrontMotorPower *= 0.6;
            leftBackMotorPower *= 0.6;
            rightBackMotorPower *= 0.6;
            rightFrontMotorPower *= 0.6;
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

