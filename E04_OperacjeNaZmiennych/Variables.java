import java.util.Random;

class Variables{
	public static void main(String[] args){
		
		Random rand = new Random();
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);

		System.out.println("x = " + x + " y =" + y);
		
		boolean result = x > y;
		System.out.println("Czy x jest wiêksze od y?\n" + result);
		
		result = (x * 2) > y;
		System.out.println("Czy x pomno¿one przez 2 jest wiêksze od y?\n" + result);
	
		result = (y < (x + 3)) && (y > (x - 2));
		System.out.println("Czy y jest mniejsze od sumy x+3 i jednoczeœnie wiêksze od x pomniejszonego o 2?\n" + result);
		
		result = (x * y) % 2 == 0;
		System.out.println("Czy iloczyn liczb x i y jest parzysty??\n" + result);
	}
}


	
	
	
	