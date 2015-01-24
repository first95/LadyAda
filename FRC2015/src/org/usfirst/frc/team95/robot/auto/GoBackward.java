package org.usfirst.frc.team95.robot.auto;

import java.util.Vector;
import org.usfirst.frc.team95.robot.Robot;

public class GoBackward extends AutoMove {
	Robot robot;
	AutoMove sequence;
	
	public GoBackward(Robot robo) {
		robot = robo;
		MoveRelative move;
		move = new MoveRelative(robot, 0.0, -0.75, 0.0, 2.0);
		Vector<AutoMove> vector;
		vector = new Vector<AutoMove>();
		vector.add(move);
		sequence = new SequentialMove(vector);
	}

	@Override
	public Status init() {
		return sequence.init();
	}

	@Override
	public Status periodic() {
		return sequence.periodic();
	}

	@Override
	public Status stop() {
		return sequence.stop();
	}

}
