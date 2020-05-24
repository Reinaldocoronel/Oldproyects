package obj;

import pj.pj;

public class Trap extends Triggers implements Visible {
	boolean active = true;
	
	
	public void activate(pj pers) {
		System.out.println("* Suenan engranages y mecanismos debajo de ti, el piso comienza a moverse * ");
		pers.setinjureLeg();
	}
	
	public void use() {
		active = false; 
		
	}

	@Override
	public String message() {
		String message = "algo parece extraño de esta parte del suelo";
		return message; 
	}
	

}
