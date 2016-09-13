/*
 * ejercicio numero 1,tipos de conversiones
 * AlexisOllerRuz 29/10/14
 */


public class ejenum1 {
	
	public static void main (String args[]) {
		char c;
		int x;
		long k;
		double d;
		//PRIMERA LINEA
		c='Q';
		x=100;
		k=100L;
		d=100.5;
		System.out.println("PRIMERA c="+c+" x="+x+" k="+k+" d="+d);
		//SEGUNDA LINEA
		x=c;  //de char a int
		k=100;//de int a long
		k=x;  //de int a long
		d=3;  //de int a double
		System.out.println("SEGUNDA c="+c+" x="+x+" k="+k+" d="+d);
		//TERCERA LINEA
		c++;  //opera con una char
		d=x/2.0f;
		System.out.println("TERCERA c="+c+" x="+x+" k="+k+" d="+d);
		//CUARTA LINEA
		x=(int)3.0;
		k=(int)(5/2.0f);
		d=5/2.0f;
		
		System.out.println("CUARTA c="+c+" x="+x+" k="+k+" d="+d);
		//QUINTA LINEA
		
		
		
		System.out.println("QUINTA c="+c+" x="+x+" k="+k+" d="+d);
	}
}

