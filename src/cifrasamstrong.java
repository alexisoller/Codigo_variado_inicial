/*
 *AlexisOller fecha 11-nov-14 
 * programa para saber si el numero de 3 cifras es o no amstrong
 */

import java.util.Scanner;
import static java.lang.Math.pow;
public class cifrasamstrong {
	
	public static void main (String args[]) {
		int n,contador=0,copia,r=0,c,s,base,x;
		double s2,r2,contador2;
		Scanner introducir;
		introducir=new Scanner (System.in);
		System.out.println("introduce un numero ");
		n=introducir.nextInt();
		copia=n;
		while (copia>=10){
			copia=copia/10;
			contador++;
			}
		//contador++;
		s=1;
		copia=n; //System.out.println("Copia: "+copia+" n:"+n);
		
		while (copia>=10){
			r=copia % 10;
			base=1;
			for(x=1;x<=contador+1;x++){
				base=base*r;
				}
			s=s+base;
			copia=copia/10;
			}
			//System.out.println("s="+s);
		/*r2=r*1.0;
		contador2=contador*1.0;
		s2=s2+pow(r2,contador);
		s=(int)s2;*/
		if(s==n){
			System.out.println("el numero es amstrong");
			}
			else{
				System.out.println("el numero no es amstrong");
			}
		
		
	}
}

