package pj;

import World.Grid;
import obj.Collectables;

public class pj {
	private String name;
	private boolean injureLeg = false; 
	private inventory bag = new inventory(10);
	private Grid current;
	private boolean alive = true; 
	
	pj(String name,Grid current){ this.name = name;  this.current = current; }
	public String getName() { return name; }
	
	public Grid getGrid() { return current; }
	
	public void Updatelvl(Grid newer) { current = newer; }
	
	public boolean checkbag() {if(bag.checkiffull()) { return true;} else return false;}
	
	public boolean checkbag(String name) { return bag.CheckFor(name);}
	
	public void keepItem(Collectables item) { bag.put(item);}
	
	public boolean getInjurLeg() { return injureLeg;  }
	
	 public void setinjureLeg() { injureLeg = true; }
	 
	 public boolean alive() { return alive; }
	 
	 public void kill() {  alive = false;  }
}
