package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

public class robot {
    DcMotor left_Front;
    DcMotor right_Front;
    DcMotor left_Back;
    DcMotor right_Back;

    IMU imu;

    public robot(HardwareMap hardware) {
        left_Front = hardware.get(DcMotor.class, "front_left_drive");
        right_Front = hardware.get(DcMotor.class, "front_right_drive");
        left_Back = hardware.get(DcMotor.class, "back_left_drive");
        right_Back = hardware.get(DcMotor.class, "back_right_drive");
        left_Back.setDirection(DcMotor.Direction.REVERSE);
        left_Front.setDirection(DcMotor.Direction.REVERSE);

        imu = hardware.get(IMU.class, "imu");
    }
}
