package src.controls.schemes;

import java.util.function.Consumer; 

import src.org.usfirst.frc.team2264.controls.Axes;
import src.org.usfirst.frc.team2264.controls.controls;

public class ControlSchemeMain {
	public Consumer<controls> mapDriveAxes(Axes driveAxes) {
		return (c) -> {
			double xMul = -1.0, yMul = -1.0;//should be -1, -1 
			if(driveAxes.y < 0) xMul *= -1;
			c.drive = new Axes(xMul * driveAxes.x, yMul * driveAxes.y);
		};
	}
}
