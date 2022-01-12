/* 
 
  @author Víctor Castillo

*/
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("el num divisible"+ num+" entre 2");
				
		}else {
			System.out.println("el num no es divisible "+num+" entre 2");
		}
		
	}

}
