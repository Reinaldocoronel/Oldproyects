package movement;
import World.Grid;
import obj.Hitbox;
import obj.Triggers;
import pj.pj; 
public  class Move extends See{
	
	public Move(Grid current, pj pers) {
		super(current, pers);
	}
	public void mov(int dir[]){
		int tpos[] = new int[2];
			tpos[0] =getPosition() [0];
			tpos[1]= getPosition() [1];
		SetDirection(dir);
		for(int i = 0;i<2;i++) {
			tpos[i] += dir[i];
		}
		if(checkmvmt(tpos)) { 
		setPosition(tpos);
		actvTriggers(tpos);
		look();}
	}
	public void  actvTriggers(int pos[]) {
		int x = pos[0];
		int y = pos[1];
		if(current.triggers[x][y] instanceof Triggers) {
			current.triggers[x][y].activate(pers);
		}else {
		}
	}
	public boolean checkmvmt(int pos[]) {
		int x = pos[0];
		int y = pos[1]; 
		if( x <0 || x> current.lvl.length|| y < 0 || y>current.lvl[0].length) {
			System.out.println("un muro bloquea tu camino");
			return false;
			}
		else if(current.lvl[x][y] instanceof Hitbox) {
			System.out.println("tu camino es bloqueado por "+current.lvl[x][y].message());
			return false;
		}
		return true; 
	}
}
