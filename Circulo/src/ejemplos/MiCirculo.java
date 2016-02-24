package ejemplos;

import java.util.Scanner;

public class MiCirculo {

	
  public static void main(String[] args) {
	int x,y; 
	double radio, diametro, circunferencia, area;
	
  	Scanner sc = new Scanner(System.in);
  	System.out.println("Punto x: ");
	x= sc.nextInt();
	System.out.println("Punto y: ");
	y = sc.nextInt();
	System.out.println("Radio: ");
	radio = sc.nextInt();
	diametro = 2 * radio;
	circunferencia= diametro * 3.1416;
	area= 3.1416 * radio * radio;
	System.out.println("Los datos de mi círculo son Centro:" + x + "," + y + ", Radio: "+ radio + ", Diámetro: " + diametro 
			+ ", Circunferencia: " + circunferencia + ", Area: "+ area);
	sc.close();
  }
}