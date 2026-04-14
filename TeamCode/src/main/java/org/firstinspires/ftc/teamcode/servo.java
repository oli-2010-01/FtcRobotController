package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class servo {
    private Servo servo;

    public void init(HardwareMap hardwareMap) {
        servo = hardwareMap.get(Servo.class, "servoShoot");
    }

    public void setServoPos(double angle) {
        servo.setPosition(angle);
    }
}
