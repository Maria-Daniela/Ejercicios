package modelo;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		pedirLado();
	}
	
	public static void pedirLado() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese el valor del lado de la figura: ");
		int lado=scan.nextInt();
		menu(lado);
		
	}
	
	public static void menu(float lado) {
		int opcion=0;
		do {
			System.out.println("El valor del lado de la figura es: "+lado);
			System.out.println("--------------------  MENU  --------------------\n----- Seleccione la operacion que desea  realizar calcular: -----\n1.-Area\n2.- Volumen\n3.- Perimetro\n4.- Cancelar\n5.- Salir");
			Scanner scan=new Scanner(System.in);
			opcion=scan.nextInt();
		} while (opcion>5 || opcion==0);
		Cuadrado cuadrado=new Cuadrado(lado);
		Cubo cubo=new Cubo(lado);
		switch (opcion) {
		case 1:
			System.out.println("El area del cuadrado es: "+cuadrado.area());
			System.out.println("El area del cubo es: "+(cubo.area())+"\n------------------------------  Continuando ------------------------------");
			menu(lado);
			break;
		case 2:
			System.out.println("El volumen del cubo es: "+cubo.volumen()+"\n------------------------------  Continuando ------------------------------");
			menu(lado);
			break;
		case 3:
			System.out.println("El perimetro del cuadrado es: "+cuadrado.perimetro());
			System.out.println("El perimetro del cubo es: "+cubo.perimetro()+"\n------------------------------  Continuando ------------------------------");
			menu(lado);
			break;
		case 4:
			pedirLado();
			break;
		case 5:
			break;
		default:
			System.out.println("FAVOR DE INGRESAR UNA DE LAS OPCIONES DISPONIBLES");
			menu(lado);
			break;
		}
	}
	
	
}
