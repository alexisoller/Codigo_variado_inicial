/*
 * 
 */

import java.util.Scanner;
public class decimalAromanos {
	
	public static void main (String args[]) {
		Scanner introducir;
		introducir=new Scanner (System.in);
		int L1000=0,L900=0,L500=0,L400=0,L100=0,L90=0,L50=0,L40=0,L10=0,L9=0,L5=0,L4=0,L1=0,cantidad;
		int z=1; //contador
		String respuesta;
		do{
		System.out.println ("introduce una cantidad para saberla en numero romanos");
		cantidad=introducir.nextInt();
		}while ((cantidad<1)||(cantidad>3999));
		if(cantidad>=1000){
			L1000=cantidad/1000;
			cantidad=cantidad % 1000;
			if(L1000>0){
				do{
					System.out.print("M");
					
					z++;
					}while(L1000>=z);
				}
			}
			z=1;
			if(cantidad>=900){
			L900=cantidad/900;
			cantidad=cantidad % 900;
			if(L900>0){
				do{
					System.out.print("CM");
					z++;
					}while(L900>=z);
				}
			}
			z=1;
			if(cantidad>=500){
			L500=cantidad/500;
			cantidad=cantidad % 500;
			if(L500>0){
				do{
					System.out.print("D");
					z++;
					}while(L500>=z);
				}
			}
			z=1;
			if(cantidad>=400){
			L400=cantidad/400;
			cantidad=cantidad % 400;
			if(L400>0){
				do{
					System.out.print("CD");
					z++;
					}while(L400>=z);
				}
			}
			z=1;
			if(cantidad>=100){
			L100=cantidad/100;
			cantidad=cantidad % 100;
			if(L100>0){
				do{
					System.out.print("C");
					z++;
					}while(L100>=z);
				}
			}
			z=1;
			if(cantidad>=90){
			L90=cantidad/90;
			cantidad=cantidad % 90;
			if(L90>0){
				do{
					System.out.print("XC");
					z++;
					}while(L90>=z);
				}
			}
			z=1;
			if(cantidad>=50){
			L50=cantidad/50;
			cantidad=cantidad % 50;
			if(L50>0){
				do{
					System.out.print("L");
					z++;
					}while(L50>=z);
				}
			}
			z=1;
			if(cantidad>=40){
			L40=cantidad/40;
			cantidad=cantidad % 40;
			if(L40>0){
				do{
					System.out.print("XL");
					z++;
					}while(L40>=z);
				}
			}
			z=1;
			if(cantidad>=10){
			L10=cantidad/10;
			cantidad=cantidad % 10;
			if(L10>0){
				do{
					System.out.print("X");
					z++;
					}while(L10>=z);
				}
			}
			z=1;
			if(cantidad>=9){
			L9=cantidad/9;
			cantidad=cantidad % 9;
			if(L9>0){
				do{
					System.out.print("IX");
					z++;
					}while(L9>=z);
				}
			}
			z=1;
			if(cantidad>=5){
			L5=cantidad/5;
			cantidad=cantidad % 5;
			if(L5>0){
				do{
					System.out.print("V");
					z++;
					}while(L5>=z);
				}
			}
			z=1; 
			if(cantidad>=4){
			L4=cantidad/4;
			cantidad=cantidad % 4;
			if(L4>0){
				do{
					System.out.print("IV");
					z++;
					}while(L4>=z);
				}
			}
			z=1;
			if(cantidad>=1){
			L1=cantidad/1;
			cantidad=cantidad % 1;
			if(L1>0){
				do{
					System.out.print("I");
					z++;
					}while(L1>=z);
				}
			}
			System.out.println(" ");		
	}
}
