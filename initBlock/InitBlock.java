class InitBlock {
	int x;
	{
		this.x=10;
		System.out.println("INIT BLOCK");
	}
	InitBlock(){
		System.out.println("DEFAULT");
		System.out.println(x);
	}
	InitBlock(int y){
		System.out.println(x+y);
	}
	public static void main(String... s){
		// new InitBlock();
		new InitBlock(10);
		
	}
}