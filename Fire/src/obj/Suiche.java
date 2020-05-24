package obj;

import World.Grid;
import pj.pj;

public class Suiche implements Hitbox,Visible {
	private String msg;
	private boolean off = true; 
	private String apagado;
	private String encendido;
	private String recurrence;
	private int type = 0;
	private Door pro; 
	Suiche prede;
	private Collectables nec;
	private String neclack;
	public Suiche(String msg,String apagado,String encendido,String recurrence,Collectables nec,String neclack){
		this.apagado =apagado;
		this.encendido = encendido;
		this.msg = msg;
		this.nec = nec;
		this.neclack = neclack; 
		this.recurrence = recurrence; 
	}
	public Suiche(String msg,String recurrence, int type, Door pro,Suiche prede){
		this.msg = msg;
		this.type = type;
		this.pro = pro;
		this.prede = prede;
		this.recurrence = recurrence; 
	}
	public Suiche(String msg,String recurrence, int type, Door pro){
		this.msg = msg;
		this.type = type;
		this.pro = pro; 
		this.recurrence = recurrence; 
	}
	public void activateM(pj pers) {
		switch(type){
			case 0: activate(pers); break;
			case 1: activate(pers.getGrid()); break;
			case 2: activate(pers, pers.getGrid());  break; 
		}
	}
	
	 private void activate(pj pers, Grid current) {
		 if(!(pro.open())) { pro.activate(current);}
	     	else {System.out.println(recurrence);}
	}
	public boolean checkstate() { return off; }
	 private void activate(pj pers) {
	 if(checkstate()) {
	 if(pers.checkbag(nec.name())){ System.out.println(encendido);}
	 else System.out.println(neclack);
	 }else System.out.println(recurrence);
	 }
	 private void activate(Grid current){
		 if(!(prede.checkstate())) {
		     if(!(pro.open())) { pro.activate(current);}
		     	else {System.out.println(recurrence);}
		     }else {System.out.println(prede.apagado);}
	 }
	@Override
	public String message() {
		return msg;
	}
	
	

}
