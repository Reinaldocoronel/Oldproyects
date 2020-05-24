package movement;

import World.Grid;
import obj.Visible;
import pj.pj;
//incomplete
public class See extends Orientation{

	See(Grid current, pj pers) {
		super(current, pers);
	}
	 public void look(){ 
		//up by 1
		int up1X = getPosition()[0] +  up()[0];
		int up1Y = getPosition()[1]+  up()[1];
		int leftX= getPosition()[0] + left()[0];
		int leftY= getPosition()[1] + left()[1];
		int rigthX = getPosition()[0] + rigth()[0];
		int rigthY = getPosition()[1] + rigth()[1];
		if(checkifposible(leftX, leftY)) {
			if(checkifEmpty(leftX, leftY)){	
			}else { System.out.println(" a la izquierda hay "+current.lvl[leftX][leftY].message());}
		}else { System.out.println("a la izquierda hay un muro");}
		if(checkifposible(rigthX, rigthY)) {
			if(checkifEmpty(rigthX, rigthY)){				
			}else { System.out.println("a la derecha hay "+current.lvl[rigthX][rigthY].message());}
		}else {System.out.println("a la derecha hay un muro");}
		if(checkifposible(up1X, up1Y)) {
			if(checkifEmpty(up1X, up1Y)){
				int rigth1X = up1X + rigth()[0]; 
				int rigth1Y = up1Y + rigth()[1];
				int left1X  = up1X + left()[0];
				int left1Y  = up1Y + left()[1];
				if(checkifposible(rigth1X,rigth1Y)) {
					if(checkifEmpty(rigth1X,rigth1Y)) {
						
					}else { System.out.println("un paso adelante y a la derecha hay "+current.lvl[rigth1X][rigth1Y].message());}
				}else System.out.print("hay un muro al frente a la derecha");
				if(checkifposible(left1X,left1Y)) {
					if(checkifEmpty(left1X,left1Y)) {
					}else {System.out.println("un paso al frente y la izquierda hay "+current.lvl[left1X][left1Y].message());}
				}else System.out.println("hay un muro a la izquierda");
				int up2X = up1X +  up()[0];
				int up2Y = up1Y +  up()[1];
			//adelante x2
			if(checkifposible(up2X, up2Y)) {
				if(checkifEmpty(up2X, up2Y)){
					int rigth2X = up2X + rigth()[0]; 
					int rigth2Y = up2Y + rigth()[1];
					int left2X  = up2X + left()[0];
					int left2Y  = up2Y + left()[1];
			// Derecha y adelantex2
				if(checkifposible(rigth2X,rigth2Y)) {
					if(checkifEmpty(rigth2X,rigth2Y)) {
						int rigth22X = rigth2X + rigth()[0];
						int rigth22Y = rigth2Y + rigth()[1];
					if(checkifposible(rigth22X,rigth22Y)) {
						if(checkifEmpty(rigth22X,rigth22Y)) {
						}else System.out.println("dos pasos adelante y uno a la derecha hay "+current.lvl[rigth22X][rigth22Y].message());
					}
					}else { System.out.println("dos pasos adelante y dos a la derecha hay "+current.lvl[rigth2X][rigth2Y].message());}
				}else System.out.println("hay un muro hacia el frente a la derecha"); 
		   //izquierda y adelante x2
				if(checkifposible(left2X,left2Y)) {
					if(checkifEmpty(left2X,left2Y)) {
						int left22X = left2X + left()[0];
						int left22Y = left2Y + left()[1];
					if(checkifposible(left22X,left22Y)) {
						if(checkifEmpty(left22X,left22Y)) {
						}else System.out.println("dos paso adelante y uno a la izquierda hay "+current.lvl[left22X][left22Y].message());
					}
					}else {System.out.println("dos paso adelante y dos a la izquierda hay "+current.lvl[left2X][left2Y].message());}
				}else System.out.println("hay un muro dos pasos hacia el frente a la izquierda hay ");
				int up3X = up2X +  up()[0];
				int up3Y = up2Y +  up()[1];
				if(checkifposible(up3X,up3Y)) {
					if(checkifEmpty(up3X,up3Y)) {
						// Derecha y adelantex2
						int rigth3X = up3X + rigth()[0]; 
						int rigth3Y = up3Y + rigth()[1];
						int left3X  = up3X + left()[0];
						int left3Y  = up3Y + left()[1];
						if(checkifposible(rigth3X,rigth3Y)) {
							if(checkifEmpty(rigth3X,rigth3Y)) {
								int rigth33X = rigth3X + rigth()[0];
								int rigth33Y = rigth3Y + rigth()[1];
							if(checkifposible(rigth33X,rigth33Y)) {
								if(checkifEmpty(rigth33X,rigth33Y)) {
								}else System.out.println("un tres pasos adelante y uno a la derecha hay "+current.lvl[rigth33X][rigth33Y].message());
							}
							}else { System.out.println("un tres pasos adelante y dos a la derecha hay "+current.lvl[rigth3X][rigth3Y].message());}
						}else System.out.println("hay un muro hacia tres pasos al frente a la derecha"); 
				   //izquierda y adelante x2
						if(checkifposible(left3X,left3Y)) {
							if(checkifEmpty(left3X,left3Y)) {
								int left33X = left3X + left()[0];
								int left33Y = left3Y + left()[1];
							if(checkifposible(left33X,left33Y)) {
								if(checkifEmpty(left33X,left33Y)) {
								}else System.out.println("tres paso adelante y uno a la izquierda hay "+current.lvl[left33X][left33Y].message());
							}
							}else {System.out.println("tres paso adelante y dos a la izquierda hay "+current.lvl[left3X][left3Y].message());}
						}else System.out.println("hay un muro tres pasos hacia el frente a la izquierda  ");
						
						}else System.out.println("tres pasos hacia adelante hay " + current.lvl[up3X][up3Y].message());
					}else System.out.println("tres pasos hacia adelante hay un muro");
				}else {System.out.println("dos pasos adelante hay "+current.lvl[up2X][up2Y].message());}
			}else System.out.println("hay un muro dos pasos hacia el frente");
			}else {System.out.println("al frente hay "+current.lvl[up1X][up1Y].message());
			}
			}else System.out.println("hay un muro justo al frente"); 
		}
	 boolean checkifposible(int X, int Y ) {
		 if(X <current.lvl.length && Y <current.lvl[0].length && X >=0 && Y>=0) {
			 return true;
		 }
		return false;
	 }
	 boolean checkifEmpty(int X, int Y) {
				if(!(current.lvl[X][Y] instanceof Visible)){
						return true;} return false;  }
	 }
	

