package pj;

import java.util.Random;

import World.Grid;
import movement.Move;

public class Rogue extends pj {
	public Rogue(int[] pos,String name, Grid current) {
		super(name, current);
		myMov.setPosition(pos);
	}
	Move myMov = new Move(getGrid(), this);
	Characterint myInt = new Characterint(this); 
	Random roll = new Random(21);
	    public int[] front(){
	    	int[] pos = myMov.getPosition();
	    	int[] dir = myMov.up();
	    	int[] front = new int[2];
	    	front[0] += dir[0] + pos[0];
	    	front[1] += dir[1] + pos[1];
	    	return front; 
	    }
	    public int[] pos() {
	    	return myMov.getPosition();
	    }
	    
		public void move(int a) {
			switch(a){
			case 1:
				myMov.mov(myMov.up());
				break;
			case 2:
				myMov.mov(myMov.down());
				break;
			case 3: 
				myMov.mov(myMov.left());
				break;
			case 4: 
				myMov.mov(myMov.rigth());
				break;
			case 5: 
				myMov.rotateLeft();
				break;
			case 6: 
				myMov.rotateRigth();
				break;
			}
		}
		public void mirar() {
			myMov.look();
		}
	
		public void setinjureLeg() {
			int rolled = roll.nextInt();
			if(rolled < 7) { 
				myInt.getInjureLeg(this);
				super.setinjureLeg(); 
			}else {
				myInt.safe(this);
			}			
		}
		
	}

