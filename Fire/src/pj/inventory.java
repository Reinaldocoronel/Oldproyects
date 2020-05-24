package pj;

import obj.Collectables;

public class inventory {
	Collectables bag[];
	inventory(int size){
	 bag = new Collectables[size];
	}
	public void copyinto(inventory org) {
		int count = 0;
		for(Collectables y:bag) {
			count++; 
			org.bag[count] = y; 
		}
	}
	public boolean checkiffull() {
		int count = 0; 
		 for(Collectables y : bag) { if(y != null) count++; }
		 if(count<bag.length-1) return false; else return true;
	}
	 public void put(Collectables item){
		 int count = 0; 
		 for(Collectables y : bag) {
			 if(y != null) count++;
		 }
		 if(count<bag.length-1) {bag[count]= item;}
		 else System.out.println("inventario lleno");
	 }
	 
	 public boolean CheckFor(String name) {
		 for(Collectables y : bag) {
			 if(y!=null) {
			 if(y.name().equals(name)) {
				 return true; 
			 }}
		 } return false; 
	 }
	

}
