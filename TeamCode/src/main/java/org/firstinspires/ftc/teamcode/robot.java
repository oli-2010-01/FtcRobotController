package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

public class robot {
    DcMotor left_Front;
    DcMotor right_Front;
    DcMotor left_Back;
    DcMotor right_Back;

    DcMotor intakeMotor1;
    DcMotor intakeMotor2;
    DcMotorEx shootMotor;
    IMU imu;

    public robot(HardwareMap hardware) {
        left_Front = hardware.get(DcMotor.class, "leftFront");
        right_Front = hardware.get(DcMotor.class, "rightFront");
        left_Back = hardware.get(DcMotor.class, "leftBack");
        right_Back = hardware.get(DcMotor.class, "rightBack");
        right_Back.setDirection(DcMotor.Direction.REVERSE);
        right_Front.setDirection(DcMotor.Direction.REVERSE);


        imu = hardware.get(IMU.class, "imu");

        intakeMotor1 = hardware.get(DcMotor.class, "intakeMotor1");
        intakeMotor2 = hardware.get(DcMotor.class, "intakeMotor2");
        shootMotor = hardware.get(DcMotorEx.class, "shootMotor");
        intakeMotor1.setDirection(DcMotor.Direction.REVERSE);
        intakeMotor2.setDirection(DcMotor.Direction.REVERSE);
        shootMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);;
    }
}
