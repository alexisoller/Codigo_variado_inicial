/*
 * programa para calcular 6 numeros entre 1-49
 * 
 */

import java.util.Random;
public class azar001 {
	public static int numeroA(int rgA,int rgB){
		Random rnd = new Random();
		int c;
		c=rnd.nextInt(rgB-rgA+1)+1;
		return c;
		}
	
	public static void main (String args[]) {
		int n1,n2,n3,n4,n5,n6;
		int rgA,rgB;
		rgA=1;
		rgB=49;
		n1=numeroA(rgA,rgB);
		do{
			n2=numeroA(rgA,rgB);
		}while(n1==n2);
		
		do{
			n3=numeroA(rgA,rgB);
		}while((n3==n2)||(n3==n1));
		
		do{
			n4=numeroA(rgA,rgB);
		}while((n4==n2)||(n4==n1)||(n4==n3));
		
		do{
			n5=numeroA(rgA,rgB);
		}while((n5==n2)||(n5==n1)||(n5==n3)||(n5==n4));
		do{
			n6=numeroA(rgA,rgB);
		}while((n6==n2)||(n6==n1)||(n6==n3)||(n6==n4)||(n6==n5));
	System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
	}

}

