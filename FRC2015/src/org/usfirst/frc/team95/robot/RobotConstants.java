package org.usfirst.frc.team95.robot;

public class RobotConstants {
	public static double kMotorSpeedChangeMaximum = 0.5;
	public static int kFrontLeftMotor = 1;
	public static int kFrontRightMotor = 2;
	public static int kBackLeftMotor = 4;
	public static int kBackRightMotor = 3;
	public static int kArmMotor = 5;
	public static int kFingerMotor = 6;
	public static int kFrontLeftEncoder = 1;
	public static int kFrontRightEncoder = 3;
	public static int kBackLeftEncoder = 5;
	public static int kBackRightEncoder = 7;
	public static int kArmEncoder = 9;
	public static int kFingerEncoder = 99999;
	public static int kGyro = 0;
	public static int kChasis = 0;
	public static int kWeapons = 1;
	public static int kChangeDriveStyle = 2;
	public static int kFieldCentric = 5;
	public static int kRotate90Left = 3;
	public static int kRotate90Right = 4;
	public static int kCalibrationLength = 500;
	public static double kArmP = 0.0;
	public static double kArmI = 0.0;
	public static double kArmD = 0.0;
	public static double kFingerP = 0.0;
	public static double kFingerI = 0.0;
	public static double kFingerD = 0.0;
	public static double kPIDUpdateInterval = 50.0;
	public static double[] kFingerSetpoints = {0, 0, 0, 0, 0, 0};
	public static double kDeadband = 0.04;
	public static double kTurningCloseness = 1;
	public static double kTurningTimeoute = 5;
	public static double kArmPositionGrab = 0.0;
	public static double kArmPositionZenith = 1.0;
	public static int kArmPistons = 0;
	public static int kArmPistonsButton = 7;
}
