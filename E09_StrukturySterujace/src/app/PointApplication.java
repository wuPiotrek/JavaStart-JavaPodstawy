package app;

import controller.PointController;
import data.Point;

public class PointApplication {

	public static void main(String[] args) {
		
		Point point1 = new Point(0, 0);
		PointController move = new PointController();
		
		final int ADD_X = 1;
		final int ADD_Y = 2;
		final int MINUS_X = 3;
		final int MINUX_Y = 4;
		
		int choice = 1;
		
		switch(choice) {
		case ADD_X:
			move.addX(point1);
			break;
		case ADD_Y:
			move.addY(point1);
			break;
		case MINUS_X:
			move.minusX(point1);
			break;
		case MINUX_Y:
			move.minusY(point1);
			break;
		}
		
		System.out.println("Wspó³rzêdne punktu po zmianie: (" + point1.getX() + ";" + point1.getY() + ")");
		
	}

}
