/*
 *AlexisOller fecha 11-nov-14 
 * programa para saber si el numero de 3 cifras es o no amstrong
 */

import java.util.Scanner;
public class cifras3amstrong {
	
	public static void main (String args[]) {
		int c1,c2,c3,r,n,s;
		Scanner introducir;
		introducir=new Scanner (System.in);
		do{
			System.out.println("introduce un numero de 3 cifras");
			n=introducir.nextInt();
		}while((n<100)||(n>=1000));
		c1=n/100;
		r=n%100;
		c2=r/10;
		c3=r%10;
		
		s=(c1*c1*c1)+(c2*c2*c2)+(c3*c3*c3);
		
		if(s==n){
			System.out.println("el numero es amstrong");
			}
			else{
				System.out.println("el numero no es amstrong");
			}
		
		
	}
}

