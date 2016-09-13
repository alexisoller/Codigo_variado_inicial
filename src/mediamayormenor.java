/*
 */

import java.util.Scanner;
public class mediamayormenor {
	
	public static void main (String args[]) {
		Scanner introducir;
		introducir=new Scanner (System.in);
		int numero,cuantos,mayor,menor,contador=1;
		double media,suma=0;
		System.out.print("cuantos numeros: ");
		cuantos=introducir.nextInt();
		System.out.print("numero "+contador+" : ");		
		numero =introducir.nextInt();
		mayor=numero;
		menor=numero;
		suma=suma+numero;
		contador++;
		while (contador<=cuantos){
		System.out.print("numero "+contador+" : ");		
		numero =introducir.nextInt();
		if(numero>mayor){
			mayor=numero;
			}
			if(numero<menor){
			menor=numero;
			}
				suma=suma+numero;
				contador++;
			 }
			 media=suma/cuantos;
			 System.out.print("se han introducido "+cuantos+" numeros ");
			 System.out.print("el mayor es "+mayor+" y el menor es "+menor+" ");
			 System.out.print("la media es "+media);		
	}
}

