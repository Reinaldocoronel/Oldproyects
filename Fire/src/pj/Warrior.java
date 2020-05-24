package pj;

import World.Grid;

public class Warrior extends pj{
	int countleg = 0;
	public Warrior(String name, Grid current) {
		super(name,current);
	}
	Characterint myInt = new Characterint(this);
	public void setinjureLeg() {
		countleg++; 
		
		if(countleg == 3)
		 setinjureLeg();
		 
	 }

}
