package app;
import controller.PointController;
import data.Point;

public class PointApplication {

	public static void main(String[] args) {
		
		Point point1 = new Point(0, 0);
		PointController move = new PointController();
		
		System.out.println("Wspó³rzêdne punktu: (" + point1.getX() + ";" + point1.getY() + ")");
		move.addX(point1);
		System.out.println("Wspó³rzêdne punktu: (" + point1.getX() + ";" + point1.getY() + ")");
		move.addX(point1);
		move.addY(point1);
		System.out.println("Wspó³rzêdne punktu: (" + point1.getX() + ";" + point1.getY() + ")");
		move.minusX(point1);
		move.minusX(point1);
		move.minusX(point1);
		move.minusX(point1);
		move.minusX(point1);
		move.minusY(point1);
		move.minusY(point1);
		move.minusY(point1);
		move.minusY(point1);
		move.minusY(point1);
		move.minusY(point1);
		move.minusY(point1);
		move.minusY(point1);
		System.out.println("Wspó³rzêdne punktu: (" + point1.getX() + ";" + point1.getY() + ")");
		
	}

}
