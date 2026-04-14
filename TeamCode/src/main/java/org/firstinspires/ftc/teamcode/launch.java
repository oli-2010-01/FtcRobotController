package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.servo;

@TeleOp
public class launch extends OpMode {
    servo launch = new servo();

    @Override
    public void init() {
        launch.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.a && gamepad1.b) {
            telemetry.addData("helo", true);
            launch.setServoPos(0.5);
        } else if (gamepad1.a) {
            telemetry.addData("pressedA", true);
            launch.setServoPos(-1.0);
        } else if (gamepad1.b) {
            telemetry.addData("Press", true);
            launch.setServoPos(0.0);
        } else {
            telemetry.addData("Pressed", true);
            launch.setServoPos(1.0);
        }
    }
}
