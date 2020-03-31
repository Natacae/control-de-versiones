package Numeros;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Variables calculadora 
		int a=0;
		int b=0;
		int res=0;
		String sel=null;
		
		
		
		Scanner tec=new Scanner(System.in); //Objeto
		System.out.println("seleccione la opción");//imprimir en pantalla
		System.out.println("+:Suma\n");
		System.out.println("-: Resta\n");
		System.out.println("*: Multiplicación\n");
		System.out.println("/: División\n");
		
		
		sel=tec.next();
		//el switch se encarga de estructurar una selección multiple
		switch(sel){
		case "+":
			System.out.println("ha seleccionado suma\n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;//finaliza el case
			
			
		case "-":
			System.out.println("ha seleccionado resta\n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
			
			
		case "*":
			System.out.println("ha seleccionado multiplicación\n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
			
			
		case "/":
			System.out.println("ha seleccionado división\n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a+"/"+b+"="+res);
			break;
		default://se usa cuando no elegimos ningun modificador 
			System.out.println("Esa opción no existe");
		}
	}

}