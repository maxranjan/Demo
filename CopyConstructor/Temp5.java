class Temp5{
	String company = "Amazon.com";
	String name;
	int age;
	String address;
	
	Temp5(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
/*
void get(){
		System.out.println("ENTER YOUR NAME:");
		name = new java.util.Scanner(System.in).nextLine();
	
		System.out.println("ENTER YOUR AGE:");
		age = new java.util.Scanner(System.in).nextInt();

		System.out.println("ENTER YOUR ADDRESS:");
		address = new java.util.Scanner(System.in).nextLine();
}*/

void show(){
	System.out.println(company);
	System.out.println(name);
	System.out.println(age);
	System.out.println(address);
}


Temp5(Temp5 z){
	this.name = z.name;
	this.age = z.age;
	this.address = z.address;
}

	public static void main(String... s){
		Temp5 t5 = new Temp5("Nicky Ranjan", 23,"Turki");
		//t5.get();
		t5.show();
        System.out.println("\n Here The Copy Constructor \n");
		Temp5 t6 = new  Temp5(t5);
		t6.show();
	}
}