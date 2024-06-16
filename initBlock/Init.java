class Init {
	int x;
	{
		this.x=10;
		System.out.println("INIT BLOCK");
	}
	Init(){
		System.out.println("DEFAULT");
		System.out.println(x);
	}
	Init(int y){
		System.out.println(x+y);
	}
	public static void main(String... s){
		// new InitBlock();
		new Init(10);
		
	}
}