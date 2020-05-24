package movement;

import World.Grid;
import pj.pj;

public class Vector extends Position{
	
	Vector(Grid current, pj pers) {
		super(current, pers);
	}
	private int[] direction = {1,0}; 
	
	public int[] GetDirection() {
		return direction; 
	}
	public void SetDirection(int dir[]) {
		direction = dir; 
	}
}
