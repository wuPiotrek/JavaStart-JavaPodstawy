class Calculate{
	
	public static void main(String[] args){
		
		Calculator calculator = new Calculator();
		
		double x = 15;
		double y = 3;
		
		System.out.println("x = " + x + " , y = " + y + "\n");
		System.out.println("x + y = " + calculator.add(x, y));
		System.out.println("x - y = " + calculator.subtract(x, y));
		System.out.println("x * y = " + calculator.multiply(x, y));
		System.out.println("x / y = " + calculator.division(x, y));		
	}
}