package console;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Escanner {
	
	
	public String read() {
		Scanner scan = new Scanner(System.in);
		String br= "";
		try(scan){
			br = scan.nextLine();}
		catch (NoSuchElementException e){
			scan.close();
		}
		return br;
			
		}
	}

