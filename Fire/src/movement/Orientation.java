package movement;

import World.Grid;
import obj.Interactions;
import pj.pj;

public class Orientation extends Vector {
	
	Orientation(Grid current, pj pers) {
		super(current, pers);
		
	}
	int dirup[] = {1,0};
	int dirdown[]= {-1,0};
	int dirLeft[] = {0,-1};
	int dirRigth[] = {0,1};
	
	public void rotateLeft(){
		int t[] = dirup;
		dirup = dirLeft;
		dirLeft = dirdown; 
		dirdown = dirRigth; 
		dirRigth = t; 
	}
	public void rotateRigth() {
		int t[] = dirup;
		dirup = dirRigth; 
		dirRigth = dirdown;
		dirdown = dirLeft; 
		dirLeft = t; 
	}

	public int[] up() {	
		return dirup;
	}
	public int[] down() {
		if(pers.getInjurLeg()) {
			Interactions.trybacking();
			int[] no = {0,0};
			return no; 
		}
		rotateLeft();
		rotateLeft();
		return dirup;
	}
	public int[] left() {
		return dirLeft;
	}
	public int[] rigth() {
		return dirRigth;
	}
	    
}
