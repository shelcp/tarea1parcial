package hn.sus.taread;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args ){
	        System.out.println( "Areas" );
	        System.out.println( "------------------------------------" );
	        int opcion = 0;
	        
	        
	        while(opcion != 5) {
	        	imprimirMenu();
	        	opcion = leerEnteroTeclado("");
	        	Double resultado = null;
	        	if(opcion == 1) {
	        		resultado = Triangulo(leerDecimalTeclado("Ingrese la base:"),leerDecimalTeclado("Ingrese la altura:"));
	        	}else if(opcion == 2) {
	        		resultado = rectangulo(leerDecimalTeclado("Ingrese la base:"),leerDecimalTeclado("	Ingrese la altura:"));

	        	}else if(opcion == 3) {
	        		resultado = circulo(leerDecimalTeclado("Ingrese el radio:"));

	        	}else if(opcion == 4) {
	        		resultado = cuadrado(leerDecimalTeclado("Ingrese un lado:"));

	        	}else {
	        		System.out.println("Finalizando la aplicación.");
	        	}
	        	System.out.println("El area es: "+resultado);
	        }
	        
	        
	        
	    }
	 
	 private static double leerDecimalTeclado(String mensaje) {
			Scanner teclado = new Scanner(System.in);
			System.out.println(mensaje);
			return teclado.nextDouble();
		}

    	
    	private static int leerEnteroTeclado(String mensaje) {
    		Scanner teclado = new Scanner(System.in);
    		System.out.println(mensaje);
    		return teclado.nextInt();
    	}
    	private static void imprimirMenu() {
    		System.out.println("Calculadora de áreas");
            System.out.println("1. Calcular el área de un Triangulo");
            System.out.println("2. Calcular el área de un rectangulo");
            System.out.println("3. Calcular el área de un circulo");
            System.out.println("4. Calcular el área de un cuadrado");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
    	}
    	
    	public static  double circulo(double radio) {
            return Math.PI * radio * radio;
        }

        public  static double cuadrado(double lado) {
            return lado * lado;
        }

        public static double rectangulo(double base, double altura) {
            return base * altura;
        }

        public static double Triangulo(double base, double altura) {
            return (base * altura) / 2;
        }
    	
    	
}
