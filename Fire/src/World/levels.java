package World;


import obj.*;

public class levels {
	private  Grid lvl1 = new Grid();
	private  Grid lvl2 = new Grid();
	private int[] initialpos = new int[2]; 
	
	public Grid getlevel(int a) {
		switch(a) {
		case 1: {return getlevel1();}
		case 2:{ return lvl2; }
		default: {return getlevel1();}
		}	
	}
	public int[] getInitialPos() {
		return initialpos;
	}
	public void setInitialpos(int[] pos) {
		initialpos = pos; 
	}
	public Grid getlevel1() {

		int[] panelindex = {4,12};
		int[] puertaindex = {6,9};
		Item Guantes = new Item("guantes", "un par de guantes de goma");
		Decor estetoscopio = new Decor ("un viejo estetoscopio oxidado", "");
		Decor cuadroFamiliar = new Decor ("una foto enmarcada de una familia","");
		Table mesa = new Table("una vieja mesa de metal, algo oxidada", Guantes, estetoscopio,cuadroFamiliar);
		Suiche cables = new Suiche("una pared con un panel de cables sobresaliendo"
				+ "\n algunos cables estan rotos", "los cables en la pared chisporrotean",
				"algo parece estar funcionando ahora", "ya no parece haber nada malo con estos cables", 
				Guantes, "ni de coñ... no es la idea mas brillante");
		Door puerta = new Door("una puerta de metal algo corroida por el tiempo", puertaindex, "la puerta se abre");
		Suiche cuadro = new Suiche("hay un cuadro algo torcido en la pared de un bote en la mar",
				"el cuadro esta atorado", 1, puerta, cables);
		Walls pared1 = new Walls("una pared de piedra corroida por los bordes");
		Walls pared2 = new Walls("un muro con algunas piezas faltantes...");
		Walls cama   = new Walls("una cama ortopedica y sucia");
		Door panel = new Door("un muro metalico", panelindex , "un sonido de metal moviendose en una de las paredes");
		Suiche silla = new Suiche("una silla tumbada en el piso", "la silla no parece poder moverse", 2, panel);
		for(int i = 7; i< 13; i++) { lvl1.lvl[0][i] = pared1;}
		for(int i = 0; i<7; i++) {lvl1.lvl[i][7] = pared1;}
		for(int i = 0; i<4; i++) {lvl1.lvl[i][12] = pared2;}
		for(int i = 12; i<16; i++) {lvl1.lvl[5][i] = pared2;lvl1.lvl[3][i] = pared2; }
		for(int i = 3; i<6; i++) {lvl1.lvl[i][15]= pared1;}
		lvl1.lvl[6][11] = pared1;
		lvl1.lvl[6][12] = pared1;
		lvl1.lvl[4][12]= panel; 
		lvl1.lvl[1][11]= silla; 
		lvl1.lvl[6][8] = cuadro;
		lvl1.lvl[1][8] = cama; 
		lvl1.lvl[6][10]= cables;
		lvl1.lvl[6][9] = puerta;
		lvl1.lvl[4][14] = mesa; 
		initialpos[0]= 2;
		initialpos[1]=9;
		return lvl1;
	}
}
