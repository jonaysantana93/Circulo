package ejemplos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PruebaCirculo {

	public static void main(String[] args) {

		Circulo circulo = new Circulo(37, 43, 2.5);
		String salida = "La coordenada X es " + circulo.obtenerX() +
		"\nLa coordenada Y es " + circulo.obtenerY() +
		"\nEl radio es " + circulo.obtenerRadio();
		circulo.establecerX(35);
		circulo.establecerY(20);
		circulo.establecerRadio(4.25);
		salida += "\n\nLa nueva ubicaci�n y el radio del c�rculo son\n" +
		circulo.toString();
		DecimalFormat dosDigitos = new DecimalFormat("0.00");
		salida += "\nEl di�metro es " +
		dosDigitos.format(circulo.obtenerDiametro());
		salida += "\nLa circunferencia es " +
		dosDigitos.format(circulo.obtenerCircunferencia());
		salida += "\nEl �rea es " + dosDigitos.format(circulo.obtenerArea());
		JOptionPane.showMessageDialog(null, salida);
		System.exit(0);

	} 

} 

