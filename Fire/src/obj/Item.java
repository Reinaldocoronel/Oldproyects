package obj;

public class Item implements Collectables {
	String name;
	String msg;
	
     public Item(String name,String msg){
    	 this.name = name;
    	 this.msg = msg;
     }
     public String msg() {
    	 return msg;
     }
	@Override
	public String name() {
		return name;
	}

}
