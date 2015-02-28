package org.usfirst.frc.team95.robot.auto;

import org.usfirst.frc.team95.robot.Robot;

public class GoLeft extends PureSequentialMove {

	public GoLeft(Robot robot) {
		AutoMove[] vector = { new MoveRelative(robot, 0.75, 0.0, 0.0, 0.5) };
		sequence = new SequentialMove(vector);
	}
}
