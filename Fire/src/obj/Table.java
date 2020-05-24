package obj;

public class Table implements Hitbox, Visible, Storage {
	Item[] mesa;
	String msg; 
	public Table(String msg, Item...a) {
		this.msg = msg;
		mesa = new Item[a.length];
		mesa=a; 
	}
	@Override
	public String list() {
		String list = ""; 
		for(Item y : mesa) {
			if(y!=null)
			list += "\n" + y.name();
		}
		return list;
	}

	@Override
	public Collectables take(String name) {
		Collectables item = null; 
		 int count = 0; 
		for(Item y : mesa) {
			count++; 
		 if(y!=null & y instanceof Collectables )
		 if (y.name().equals(name)) {
			 item = y; 
			 System.out.print("guardaste "+item.msg()+" \n");
			 mesa[count] = null;
		 }
		}
		if(item == null) System.out.println("... ese objeto no esta acá");
			return item;
		
	}

	@Override
	public String message() {
		String message = msg + " encima tiene " + list() + "\n";
	  return message; 
	}

}
