package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="teleop1")
public class teleop extends OpMode {
    public robot Robot;
    public buttonMap map;

    public shootButtonMap shoot;
    @Override
    public void init() {
        Robot = new robot(hardwareMap);
        map = new buttonMap();
        shoot = new shootButtonMap();
    }

    @Override
    public void loop() {
        map.loop(Robot, this);
        shoot.loop(Robot, this);
    }
}
