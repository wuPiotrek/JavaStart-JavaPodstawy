class CalcTest{
	
	public static void main(String[] args){
		
		Calculator calculator = new Calculator();
		
		double x = 15;
		double y = 10;
		double z = 5;
		
		System.out.println("x = " + x + " , y = " + y + " , z = " + z + "\n");
		System.out.println("x + y = " + calculator.add(x, y));
		System.out.println("x + y + z = " + calculator.add(x, y, z));
		System.out.println("x - y = " + calculator.subtract(x, y));
		System.out.println("x - y - z = " + calculator.subtract(x, y, z));
	}
}