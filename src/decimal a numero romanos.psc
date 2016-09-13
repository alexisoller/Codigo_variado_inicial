Proceso sin_titulo
	//AlexisOllerRuz fecha 16-10-14
	//cantidad en billetes 
	//v1
	L1000,L900,L500,L400,L100,L90,L50,L40,L10,L9,L5,L4,L1,cantidad son enteros;
	z,j,k,p,u,t,r son enteros; //contadores
	z=0;	
	escribir "introduce una cantidad";
	leer cantidad;
	Si cantidad >= 1000 Entonces
		L1000<-cantidad/1000;
		cantidad<-cantidad mod 1000;
		Si L1000>0 Entonces
			Repetir
				escribir sin saltar "M";
				z=z+1
			Hasta Que z=L1000
			
		Fin Si
	FinSi
	z=0;
	Si cantidad >= 900 Entonces
		L900<-cantidad/900;
		cantidad<-cantidad mod 900;
		Si L900>0 Entonces
			Repetir
				escribir sin saltar "CM";
				z=z+1
			Hasta Que z=L900
		Fin Si
	FinSi
	z=0;
	Si cantidad >= 500 Entonces
		L500<-cantidad/500;
		cantidad<-cantidad mod 500;
		Si L500>0 Entonces
			Repetir
				escribir sin saltar "D";
				z=z+1
			Hasta Que z=L500
			
		Fin Si
	FinSi
	z=0;
	Si cantidad >= 400 Entonces
		L400<-cantidad/400;
		cantidad<-cantidad mod 400;
		Si L400>0 Entonces
			Repetir
				escribir sin saltar "CD";
				z=z+1
			Hasta Que z=L400
		Fin Si
	FinSi
	z=0;
	Si cantidad >= 100 Entonces
		L100<-cantidad/100;
		cantidad<-cantidad mod 100;
		Si L100>0 Entonces
			Repetir
				escribir sin saltar "C";
				z=z+1
			Hasta Que z=L100
			
		Fin Si
	FinSi
	z=0;
	Si cantidad >= 90 Entonces
		L90<-cantidad/90;
		cantidad<-cantidad mod 90;
		Si L90>0 Entonces
			Repetir
				escribir sin saltar "XC";
				z=z+1
			Hasta Que z=L90
			
		Fin Si
	FinSi
	z=0;
	Si cantidad >= 50 Entonces
		L50<-cantidad/50;
		cantidad<-cantidad mod 50;
		Si L50>0 Entonces
			Repetir
				escribir sin saltar "L";
				z=z+1
			Hasta Que z=L50
		Fin Si
	FinSi
	z=0;
	Si cantidad >= 40 Entonces
		L40<-cantidad/40;
		cantidad<-cantidad mod 40;
		Si L40>0 Entonces
			Repetir
				escribir sin saltar "XL";
				z=z+1
			Hasta Que z=L40
			
		Fin Si
	FinSi
	z=0;
	Si cantidad >= 10 Entonces
		L10<-cantidad/10;
		cantidad<-cantidad mod 10;
		Si L10>0 Entonces
			Repetir
				escribir sin saltar "X";
				z=z+1
			Hasta Que z=L10
		Fin Si
	FinSi

	z=0;
	Si cantidad >= 9 Entonces
		L9<-cantidad/9;
		cantidad<-cantidad mod 9;
		Si L9>0 Entonces
			Repetir
				escribir sin saltar "IX";
				z=z+1
			Hasta Que z=L9
		Fin Si
	FinSi
	
	z=0;
	Si cantidad >= 5 Entonces
		L5<-cantidad/5;
		cantidad<-cantidad mod 5;
		Si L5>0 Entonces
			Repetir
				escribir sin saltar "V";
				z=z+1
			Hasta Que z=L5
		Fin Si
	FinSi
	z=0;
	Si cantidad >= 4 Entonces
		L4<-cantidad/5;
		cantidad<-cantidad mod 4;
		Si L4>0 Entonces
			Repetir
				escribir sin saltar "IV";
				z=z+1
			Hasta Que z=L4
		Fin Si
	FinSi	
	z=0;
	Si cantidad >=1 Entonces
		L1<-cantidad/1;
		cantidad<-cantidad mod 1;
		Si L1>0 Entonces
			Repetir
				escribir sin saltar "I";
					z=z+1
			Hasta Que z=L1
		Fin Si
	FinSi
	escribir "";
	escribir "MMMCMXCIX"
FinProceso
