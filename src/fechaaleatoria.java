/*
 * 
 * 
 */

import utilidades.*;
import java.util.Scanner;
public class fechaaleatoria {
	
	public static void main (String args[]) {
	int d,m,a;
	Aleatorio fecha =new Aleatorio();
	d=fecha.CalcularNumero (1,31);
	m=fecha.CalcularNumero (1,12);
	a=fecha.CalcularNumero (1900,2200);
	System.out.print (d+""+m+""+a);
	
	}
}

