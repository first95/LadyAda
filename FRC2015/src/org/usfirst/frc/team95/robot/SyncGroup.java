/*
 * This File is released under the LGPL.
 * You may modify this software, use it in a project, and so on,
 * as long as this header remains intact.
 */

package org.usfirst.frc.team95.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.PIDOutput;

/**
 *
 * @author daroc
 */
public class SyncGroup implements PIDOutput {
    SpeedController[] mSpeedControllers;
    boolean[] mReversed;
    double maxSpeed = 1.0;
    
    
    public SyncGroup (SpeedController[] SpeedControllers) {
        mSpeedControllers = SpeedControllers;
        mReversed = new boolean[mSpeedControllers.length]; //Initializes to false
        System.out.println("I'm initializing.");
    }
    
    public SyncGroup (SpeedController[] SpeedControllers, boolean[] Reversed) {
        mSpeedControllers = SpeedControllers;
        mReversed = Reversed;
    }
    
    
    public void set(double d) {
    	if (d > maxSpeed) {
    		d = maxSpeed;
    	} else if (d < -maxSpeed) {
    		d = -maxSpeed;
    	}
    	
        for (int i = 0; i < mSpeedControllers.length;  i++) {
            if (mReversed[i]) {
                mSpeedControllers[i].set(-d);
            } else {
                mSpeedControllers[i].set(d);
            }
        }
    }
    
    public void pidWrite(double bob) {
    	set(bob);
    }
    
    public double getMotor() {
        return mSpeedControllers[0].get();
    }
    
    public void setMaxSpeed(double speed) {
    	maxSpeed = speed;
    }
    
}
