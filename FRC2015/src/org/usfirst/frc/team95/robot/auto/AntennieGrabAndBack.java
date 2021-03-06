package org.usfirst.frc.team95.robot.auto;

import org.usfirst.frc.team95.robot.Robot;

public class AntennieGrabAndBack extends PureSequentialMove {

	public AntennieGrabAndBack(Robot robot) {
		AutoMove[] moves = {
				new AutoAlign(robot, 1.0),
				new Pistons(robot.antennie, true),
				new PlainMotorMove(robot.armMotors, 0.5, 0.75),
				new PlainMotorMove(robot.armMotors, 0.5, 0.75),
				new GoBackward(robot), new Pistons(robot.antennie, false) };
		sequence = new SequentialMove(moves);
	}

}
