package console;

import java.util.Scanner;
import World.levels;
import obj.Collectables;
import obj.Storage;
import obj.Suiche;
import obj.Triggers;
import pj.Rogue;

public class Ptripoff {

	public static void main(String[] args) {
		//assets 
		Scanner scan = new Scanner(System.in);
		//create world
		Cutscenes scenes = new Cutscenes();
		levels lvl = new levels();
		scenes.intro();
		//create character
		String confirm; 
		String name;
		do {
		System.out.println("intentas recordar tu nombre...");
		name = scan.nextLine();
		System.out.println("¿ "+name +" eres tu?");
		confirm = scan.nextLine();
		}while((!(confirm.equals("si"))));
		Rogue pers = new Rogue(lvl.getInitialPos(),name,lvl.getlevel1());
		boolean end = true;
		scenes.lvl1(name);
		do {
			System.out.println("¿qué quieres hacer ahora?");
			String action;
			action = scan.nextLine().trim().toLowerCase();
			if(action.equals("golpear")) System.out.println("golpeas el aire");
			if(action.equals("caminar")) System.out.println("para caminar solo di la direccion.");
			if(action.equals("adelante")) pers.move(1);
			else if(action.equals("atras")) pers.move(2);
			else if(action.equals("izquierda")) pers.move(3);
			else if(action.equals("derecha")) pers.move(4);
			else if(action.equals("rotar izquierda")) pers.move(5);
			else if(action.equals("rotar derecha")) pers.move(6);
			else if(action.equals("usar")) {
				if(pers.getGrid().triggers[pers.front()[0]][pers.front()[1]] instanceof Triggers ) {
					pers.getGrid().triggers[pers.front()[0]][pers.front()[1]].use();
				}else System.out.println(name+ ": no hay nada que pueda usar aca");
			}
			else if(action.equals("tomar")) {
				if(pers.getGrid().lvl[pers.front()[0]][pers.front()[1]] instanceof Collectables ) {
					pers.keepItem((Collectables)pers.getGrid().lvl[pers.front()[0]][pers.front()[1]]);
				}else if(pers.getGrid().lvl[pers.front()[0]][pers.front()[1]] instanceof Storage) {
					System.out.print("que objeto deseas tomar: " +((Storage) pers.getGrid().lvl[pers.front()[0]][pers.front()[1]]).list());
					String take = scan.nextLine();
					 if(pers.checkbag()) {System.out.println("Inventario lleno...");}
					 else pers.keepItem(((Storage)pers.getGrid().lvl[pers.front()[0]][pers.front()[1]]).take(take));
			    }else System.out.println(name+ ": es solo basura");
			}
			else if(action.equals("arreglar")||action.equals("levantar silla")|| action.equals("enderezar")) {
				if(pers.getGrid().lvl[pers.front()[0]][pers.front()[1]] instanceof Suiche) {
					((Suiche) pers.getGrid().lvl[pers.front()[0]][pers.front()[1]]).activateM(pers);
				}
			}
			else if(action.equals("help"))scenes.help();
			else if(action.equals("quit"))pers.kill(); 	
		}while(end && pers.alive());
		System.out.println("termino esto");
		if(!(pers.alive())) scenes.perdiste();
		
		}
	}
