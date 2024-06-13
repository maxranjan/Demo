class Temp2{
	int x;
	int y;
	// default constructor with parameter 
	Temp2(int x, int y){
		this.x = x;
		this.y= y;
	}
	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String... s){
		Temp2 t2 = new Temp2(10,20);
		t2.show();
		
		Temp2 t3 = new Temp2(100,200);
		t3.show();

	}
}