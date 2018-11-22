class Calculator{
	
	double add(double x, double y){
		return x + y;
	}
	
	double add(double x, double y, double z){
		return add(x, y) + z;
	}
	
	double subtract(double x, double y){
		return x - y;
	}
	
	double subtract(double x, double y, double z){
		return subtract(x, y) - z;
	}	
}