package martes5_9;

import java.util.Scanner;

public class Ejercicio_for {
	
	public static void ejercicio_for1(){
	int i;
	int acum=0;
	int num ; 
	float promedio;
	Scanner lector = new Scanner(System.in);
	for (i=0; i<10; i++){
		System.out.println("ingrese un numero entero");
		num=Integer.parseInt(lector.nextLine());
		acum = acum+num;
		}
	
	promedio = acum/i;
	System.out.println("el promedio de los numero ingresados es "+promedio);
	
	}
	
	public static void ejercicio_for2(){
		int numero=0; 
		int i=0;
		int resultado;
		int tabla ;
		System.out.println("ingrese un valor de tabla :");
	Scanner n = new Scanner(System.in);
	resultado = Integer.parseInt(n.nextLine());
	for(i=0; i<10; i++){
		tabla=numero*resultado;
	}
	}
}
