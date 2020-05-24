package obj;

import World.Grid;

public class Door implements Hitbox, Visible {
	String msg;
	String msgopen;
	boolean open = false;
	int[] pos = new int[2]; 
		public Door(String msg, int[] pos,String msgopen){
			this.pos = pos;
			this.msg = msg; 
			this.msgopen = msgopen;
		}
	protected void activate(Grid current) {
		current.lvl[pos[0]][pos[1]] = null;
		System.out.println(msgopen);
		open = true;
	}
	public boolean open() {
		return open;
	}
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return msg;
	}
}
