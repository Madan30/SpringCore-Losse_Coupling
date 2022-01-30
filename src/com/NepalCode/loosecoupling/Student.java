package com.NepalCode.loosecoupling;

public class Student {

	/*int id; // depenceny in the form of literals

	// MathCheat mathCheat = new MathCheat(); // type coupling not good practice
	private MathCheat mathCheat; // injecting dependency in the form of object types literals
	private ScienceCheat scienceCheat;

	// to inject object and literals dependency we have to use setter and
	// constructor injection

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void setId(int id) {
		this.id = id;
	}
	*/
	
	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void cheating() {
		cheat.cheat();
	}
	
	

}
