class Temp3{
	Temp3(){
		System.out.println("Default");
	}
	void Temp3()
	{
		System.out.println("Hello");
	}
	// same class name, function name with same method 
	public static void main(String... s){
		new Temp3().Temp3();
    // Here new Temp3() - It is an Object of Temp3. and Another - Temp3(); is the Method of Class Temp3.
    // In java we can execute Both.
	}
}