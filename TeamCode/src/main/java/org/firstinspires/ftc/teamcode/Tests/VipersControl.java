package org.firstinspires.ftc.teamcode.Tests;

import android.media.MediaFormat;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.ViperSubsystem2;

@TeleOp
public class VipersControl extends LinearOpMode {
@Override
    public void runOpMode(){
    ViperSubsystem2 viper = new ViperSubsystem2(hardwareMap,  0.001, 0, 0, 0.01, 0, 0);

    waitForStart();
    while (opModeIsActive()){
        viper.periodic(gamepad2);


        telemetry.addData("extencion", viper.getExtension());
        telemetry.addData("angle", viper.getCurrentAngle());

        telemetry.addData("motorL", viper.angleML.getCurrentPosition());
        telemetry.addData("motorR", viper.angleMR.getCurrentPosition());

        telemetry.addData("angle", viper.getCurrentAngle());

        telemetry.addData("targetA", viper .targetTicks);

        telemetry.update();
    }
}
}
