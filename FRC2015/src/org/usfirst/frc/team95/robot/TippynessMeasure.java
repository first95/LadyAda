package org.usfirst.frc.team95.robot;

public class TippynessMeasure {
	double average;
	double total;
	double measures;
	double[] window;
	
	public TippynessMeasure() {
		total = 0;
		measures = 0;
		average = 0;
	}
	
	public void update(double angle) {
		window = shift(window);
		window[0] = angle;
		total += angle;
		measures += 1;
		average = total / measures;
	}
	
	public boolean tipped() {
		return Math.abs(mean(window) - average) > RobotConstants.kTippynessTolerance;
	}
	
	private double[] shift(double[] table) {
    	for (int i = table.length - 1; i > 0; i--) {
    		table[i] = table[i - 1];
    	}
    	return table;
    }
    
    private double mean(double[] table) {
    	double sum = 0;
    	for (int i = 0; i < table.length; i++) {
    		sum += table[i];
    	}
    	return sum / table.length;
    }

}
