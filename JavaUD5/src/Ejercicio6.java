/* 
 
  @author Víctor Castillo

*/
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero");
		double num=sc.nextInt();
		final double iva=0.21;
		
		System.out.println("el iva de "+num+" es: "+num*iva);
		System.out.println("El precio del producto con iva seria: "+(num+(num*iva)));
		
	}

}
