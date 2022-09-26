class SandTester{
	public static void main(String args []){
		
		Sand.setSandTypes("2 Types");
		Sand.setSandColor("M Sand");
		Sand.setSandArea("Bangalore");
		
		System.out.println(Sand.getSandType()+"\n"+ Sand.getSandColor() + "\n" + Sand.getSandArea() );
	}
}