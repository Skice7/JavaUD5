/* 
 
  @author Víctor Castillo

*/

public class Ejercicio11 {
	
	public static void main(String[] args) {	
		
		String dia="martes";
		
		switch (dia){
		case "lunes":case "martes":case "miercoles":case "jueves":case "viernes":	
			
			dia = "El "+dia+" sí es dia Laboral";
			
			break;
		case "sabado": case "domingo":
			
			dia = "El "+dia+" no es dia Laboral";
			
			break;
		default:
			dia = "Error";
			break;
		}
		System.out.println(dia);
	}
}
