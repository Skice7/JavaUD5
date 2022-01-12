/* 
 
  @author Víctor Castillo

*/

import javax.swing.JOptionPane;

public class CalculadoraInversa {

	public static void main(String[] args) {
		double num1;
        double num2;
        double resultado = 0;
        String textonum1 = JOptionPane.showInputDialog("Escribe primer numero");
        num1 = Integer.parseInt(textonum1);
        String operacion = JOptionPane.showInputDialog("Escribe el signo aritmetico");
        String textonum2 = JOptionPane.showInputDialog("Escribe el operando 2");
        num2 = Integer.parseInt(textonum2);
 
        switch (operacion){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            case "/":
                resultado = num1/num2;
                break;
            case "^":
                resultado = (int)Math.pow(num1, num2);
                break;
            case "%":
                resultado = num1%num2;
                break;
        }
        JOptionPane.showMessageDialog(null, num1 + " " + operacion + " " +num2 + " = " + resultado);

	}

}
