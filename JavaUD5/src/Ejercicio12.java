/* 
 
  @author V�ctor Castillo

*/
import javax.swing.JOptionPane;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		String passwd = "contra";
        boolean correcto = false;

        for (int i = 0; i < 3 && !correcto; i++) {
            String password = JOptionPane.showInputDialog("Introduce una contrase�a");
            if (password.equals(passwd)) {
                System.out.println("Enhorabuena");
                correcto = true;
            } else {
                System.out.println("Contrase�a err�nea, prueba otra vez");
            }
        }	
		
	}
}
