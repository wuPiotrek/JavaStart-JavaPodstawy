class Company{
	public static void main(String[] args){
		Employee emp1 = new Employee();	
		emp1.name = "Piotr";
		emp1.surname = "Wójtowicz";
		emp1.birthYear = 1993;
		emp1.seniority = 1;
		
		Employee emp2 = new Employee();
		emp2.name = "Tomasz";
		emp2.surname = "Tomaszuk";
		emp2.birthYear = 1986;
		emp2.seniority = 15;
		
		Employee emp3 = new Employee();
		emp3.name = "Artur";
		emp3.surname = "G¹bka";
		emp3.birthYear = 1970;
		emp3.seniority = 27;
		
		System.out.println("Pracownicy:\n");
		System.out.println("Imiê:		" 		+ emp1.name + "\n"
						+ "Nazwisko: 	" 		+ emp1.surname + "\n"
						+ "Rok urodzenia:	" 	+ emp1.birthYear + "\n"
						+ "Doœwiadczenie:	" 	+ emp1.seniority + "\n\n");
		System.out.println("Imiê:		" 		+ emp2.name + "\n"
						+ "Nazwisko: 	" 		+ emp2.surname + "\n"
						+ "Rok urodzenia:	" 	+ emp2.birthYear + "\n"
						+ "Doœwiadczenie:	" 	+ emp2.seniority	+ "\n\n");
		System.out.println("Imiê:		" 		+ emp3.name + "\n"
						+ "Nazwisko: 	" 		+ emp3.surname + "\n"
						+ "Rok urodzenia:	" 	+ emp3.birthYear + "\n"
						+ "Doœwiadczenie:	" 	+ emp3.seniority + "\n\n");
	}
}						