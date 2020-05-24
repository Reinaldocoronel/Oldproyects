package movement;

import World.Grid;
import pj.pj;

public class Position {
	Grid current; 
	pj pers; 
	Position(Grid current, pj pers){
		this.current = current;
		this.pers = pers; 
	}
	private int pos[] = new int[2];
	
	public void setPosition(int pos[]){
		this.pos = pos;
	}
	public int[] getPosition() {
		return pos; 
	}

}
