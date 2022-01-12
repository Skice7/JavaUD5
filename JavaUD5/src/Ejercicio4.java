/* 
 
  @author Víctor Castillo

*/
import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero=JOptionPane.showInputDialog("Introduce un numero para el radio");
		
		double radio=Double.parseDouble(numero);
		
		double area=Math.PI*Math.pow(radio, 2);
		System.out.println("Area: "+area);
		
		
		
	}

}
