package org.usfirst.frc.team95.robot.auto;

import org.usfirst.frc.team95.robot.Robot;

public class GrabStepCan extends PureSequentialMove {

	public GrabStepCan(Robot robot) {
		AutoMove[] moves = { new PlainMotorMove(robot.armMotors, 0.5, 1.5),
				new GoForward(robot, 1.0, 0.25), new Pistons(robot, true),
				new PlainMotorMove(robot.armMotors, 0, 0.002),
				new PlainMotorMove(robot.armMotors, -0.5, 1.25),
				new PlainMotorMove(robot.armMotors, 0, 0.2),
				new Pistons(robot, false), new NoMove(robot) };
		sequence = new SequentialMove(moves);
	}

}
