package app;

public class App {

	public static void main(String[] args) {
		
		double[] line1 = {1.0, 1.5, 2.0};
		double[] line2 = {1.5, 2.0, 2.5};
		double[] line3 = {2.0, 2.5, 3.0};
		
		double[][] array = {line1, line2, line3};
		
		System.out.println("Dzia�ania na tablicy 3x3");
		
		double sumOfMultipliesDiagonals = (array[0][0] * array[1][1] * array[2][2]) +  (array[0][2] * array[1][1] * array[2][0]);
		System.out.println("Suma iloczyn�w przek�tnych tablicy = " + sumOfMultipliesDiagonals);
		
		double multipliesSumMiddleLineMiddleColumn = (array[1][0] + array[1][1] + array[1][2]) * (array[0][1] + array[1][1] + array[2][1]);
		System.out.println("Iloczyn sum �rodkowego wiersza i �rodkowej kolumny tablicy = " + multipliesSumMiddleLineMiddleColumn);
		
		double sumOfElementsAtTheEdge = array[0][0] + array[0][1] + array[0][2] + array[1][0] + array[1][2] + array[2][0] + array[2][1] + array[2][2];
		System.out.println("Suma wszystkich element�w znajduj�cych si� przy kraw�dzi tablicy = " + sumOfElementsAtTheEdge);
		
	}

}
