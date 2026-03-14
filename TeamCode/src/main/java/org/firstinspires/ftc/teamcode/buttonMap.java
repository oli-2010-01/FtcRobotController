package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class buttonMap {
    public boolean Zero = true;
    public void loop(robot Robot, OpMode opMode) {
        if (opMode.gamepad1.right_bumper) {
            Robot.left_Front.setPower(0.6);
            Robot.left_Back.setPower(0.6);
            Robot.right_Front.setPower(0.6);
            Robot.right_Back.setPower(0.6);
        }
        if (opMode.gamepad1.left_bumper) {
            Robot.left_Front.setPower(-0.6);
            Robot.left_Back.setPower(-0.6);
            Robot.right_Front.setPower(-0.6);
            Robot.right_Back.setPower(-0.6);
        }
        if (opMode.gamepad1.dpad_left) {
            if (opMode.gamepad1.dpad_up) {
                Robot.left_Front.setPower(0);
                Robot.left_Back.setPower(0.6);
                Robot.right_Front.setPower(0.6);
                Robot.right_Back.setPower(0);
            }
            else if (opMode.gamepad1.dpad_down){
                Robot.left_Front.setPower(0);
                Robot.left_Back.setPower(-0.6);
                Robot.right_Front.setPower(-0.6);
                Robot.right_Back.setPower(0);
            }
            else {
                Robot.left_Front.setPower(-0.6);
                Robot.left_Back.setPower(0.6);
                Robot.right_Front.setPower(0.6);
                Robot.right_Back.setPower(-0.6);
            }

        }
        if (opMode.gamepad1.dpad_right) {
            if (opMode.gamepad1.dpad_up) {
                Robot.left_Front.setPower(0.6);
                Robot.left_Back.setPower(0);
                Robot.right_Front.setPower(0);
                Robot.right_Back.setPower(0.6);
            }
            else if (opMode.gamepad1.dpad_down){
                Robot.left_Front.setPower(-0.6);
                Robot.left_Back.setPower(0);
                Robot.right_Front.setPower(0);
                Robot.right_Back.setPower(-0.6);
            }
            else {
                Robot.left_Front.setPower(0.6);
                Robot.left_Back.setPower(-0.6);
                Robot.right_Front.setPower(-0.6);
                Robot.right_Back.setPower(0.6);
            }
        if (opMode.gamepad1.right_trigger_pressed) {
            Robot.left_Front.setPower(opMode.gamepad1.right_trigger);
            Robot.left_Back.setPower(opMode.gamepad1.right_trigger);
            Robot.right_Front.setPower(-opMode.gamepad1.right_trigger);
            Robot.right_Back.setPower(-opMode.gamepad1.right_trigger);
        }
        if (opMode.gamepad1.left_trigger_pressed) {
            Robot.left_Front.setPower(opMode.gamepad1.left_trigger);
            Robot.left_Back.setPower(opMode.gamepad1.left_trigger);
            Robot.right_Front.setPower(-opMode.gamepad1.left_trigger);
            Robot.right_Back.setPower(-opMode.gamepad1.left_trigger);
        }
        if (opMode.gamepad1.a) {
            Robot.left_Front.setPower(Robot.left_Front.getPower() * 0.6);
            Robot.left_Back.setPower(Robot.left_Back.getPower() * 0.6);
            Robot.right_Front.setPower(Robot.right_Front.getPower() * 0.6);
            Robot.right_Back.setPower(Robot.right_Back.getPower() * 0.6);
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
        }
    }
}
