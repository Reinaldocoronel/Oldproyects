package obj;

public class Walls implements Hitbox, Visible{
	String msg;
	public Walls(String msg){
		this.msg = msg; 
	}
	public  String message() {
		 
		return msg; }

}
