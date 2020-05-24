package obj;
import pj.Rogue;
public class Interactions {
	int countinjlg = 0; 
	String name; 
// Environment 
	public static void walls() {
		System.out.println(" hay una pared");
	}
//states 
	public static void trybacking() {
		System.out.println("\"de no curarla no podras volver a atras\"");
		System.out.println("La destruccion del ligamento te impide el movimiento en reversa");
		}
	public  void injureleg(Rogue pers) {
		countinjlg++;
		 System.out.println("haz recibido una herida grave en la pierna");
		 if(countinjlg == 1) {
		 System.out.println("de no curarla no podras volver a atras");
		 System.out.println("guiño guiño...");
		 System.out.println("podriamos decir que \"no hay vuelta atras\""); }
	}
}
