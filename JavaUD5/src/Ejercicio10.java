/* 
 
  @author V�ctor Castillo

*/
import javax.swing.JOptionPane;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		
	        
		String textoVentas = JOptionPane.showInputDialog("Introduce el n�mero de ventas"); 
        int numeroVentas = Integer.parseInt(textoVentas);
        int sumaVentas = 0;
        
        for (int i = 0; i < numeroVentas; i++) {
            textoVentas = JOptionPane.showInputDialog("Introduce el precio de venta" + (i+1));
            int venta = Integer.parseInt(textoVentas);
            sumaVentas = sumaVentas + venta;
        }
        System.out.println(sumaVentas);
	}

}
