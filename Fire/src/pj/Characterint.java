package pj;

import java.util.Random;

public class Characterint{
	String name;
	Characterint(pj pers){
		name = pers.getName();
	}
	
	public void  getInjureLeg(Rogue pers) {
		int counter = 0; 
		String a = ": te lo juro es la primera vez que me pasa esto"; 
		String b = ": Mi madre, esto si duele";
		String c = ": Mi pierna, coño "; 
		String d = ": mmmmm.... a veces es bueno observar antes de pisar, ¿sabes?";
		String e = ": no estas hecho para esto anda a jugar minecraft"; 
		switch(counter){
			case 1:
				System.out.println(name+a);
				counter++;
				break;
			case 2: 
				System.out.println(name+b);
				counter++;
				break;
			case 3:
				System.out.println(name+c);
				counter++;
				break;
			case 4:
				System.out.println(name+d);
				counter++;
				break;
			case 5: 
				System.out.println(name+e);
				counter++;
				break;
			default:
				System.out.println(name+c);
				counter++;
				break;
		}
	}
	public void  getInjureLeg(Warrior pers) {
		int counter = 0; 
		String a = ": te lo juro es la primera vez que me pasa esto"; 
		String b = ": Mi madre, esto si duele";
		String c = ": Mi pierna, coño "; 
		String d = ": mmmmm.... a veces es bueno observar antes de pisar, ¿sabes?";
		String e = ": no estas hecho para esto anda a jugar minecraft"; 
		switch(counter){
			case 1:
				System.out.println(name+a);
				counter++;
				break;
			case 2: 
				System.out.println(name+b);
				counter++;
				break;
			case 3:
				System.out.println(name+c);
				counter++;
				break;
			case 4:
				System.out.println(name+d);
				counter++;
				break;
			case 5: 
				System.out.println(name+e);
				counter++;
				break;
			default:
				System.out.println(name+c);
				counter++;
				break;
		}
	}

	public void nothing(Warrior pers) {
		Random roll = new Random(7); 
		int rolled = roll.nextInt()+1;
		String a = ": no hay nada"; 
		String b = ": esto esta como solo";
		String c = ": coño da como miedo esto "; 
		String d = ": mmmmm.... empiezo a pensar que estoy dando vueltas en circulos";
		String e = ": y si hay mas de la vida que solo robar... quisiera ser panadero"; 
		String f = ": quizas pueda pensar en una carrera politica " +name+ " para alcalde";
		String g = ": que frio hace aca ";
		switch(rolled){
			case 1:
				System.out.println(name+a);
				break;
			case 2: 
				System.out.println(name+b);
				break;
			case 3:
				System.out.println(name+c);
				break;
			case 4:
				System.out.println(name+d);
				break;
			case 5: 
				System.out.println(name+e);
				break;
			case 6:
				System.out.println(name+f);
				break;
			case 7:
				System.out.println(name+g);
				break;
				}
		}	
	public void nothing(Rogue pers){ 
		Random roll = new Random(7); 
		int rolled = roll.nextInt()+1;
		String a = ": no hay nada"; 
		String b = ": esto esta como solo";
		String c = ": coño da como miedo esto "; 
		String d = ": mmmmm.... empiezo a pensar que estoy dando vueltas en circulos";
		String e = ": y si hay mas de la vida que solo robar... quisiera ser panadero"; 
		String f = ": quizas pueda pensar en una carrera politica " +name+ " para alcalde";
		String g = ": que frio hace aca ";
		switch(rolled){
			case 1:
				System.out.println(name+a);
				break;
			case 2: 
				System.out.println(name+b);
				break;
			case 3:
				System.out.println(name+c);
				break;
			case 4:
				System.out.println(name+d);
				break;
			case 5: 
				System.out.println(name+e);
				break;
			case 6:
				System.out.println(name+f);
				break;
			case 7:
				System.out.println(name+g);
				break;
				}
		}	
	public void safe(Rogue pers) {
		System.out.println(name +"... eso estuvo cerca");
	}
	public void safe(Warrior pers) {
		System.out.println(name +"... eso estuvo cerca");
	}
	
}
