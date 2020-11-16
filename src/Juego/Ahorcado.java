package Juego;

import java.util.Scanner;

import sun.security.util.Length;

public class Ahorcado {
	public static void dibujarMuneco(int vidas) {
		switch (vidas) {
		case 7:
			System.out.println("___________________");
			
			break;
		case 6:
			
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_______________________");
			
			
			break;
		case 5:
			System.out.println("________________________");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_______________________");
	
			break;
		case 4:
			System.out.println("________________________");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|          0000000");
			System.out.println("|          0000000");
			System.out.println("|          0000000");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_______________________");
	
	
			break;
		case 3:
			System.out.println("________________________");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|          0000000");
			System.out.println("|          0000000");
			System.out.println("|          0000000");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_______________________");
	
			break;
		case 2:
			System.out.println("________________________");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|          0000000");
			System.out.println("|          0000000");
			System.out.println("|          0000000");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|           || ||");
			System.out.println("|          ||   ||");
			System.out.println("|         ||     ||");
			System.out.println("|        ||       ||");
			System.out.println("|       ||         ||");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_______________________");
	
			break;
		case 1:
			System.out.println("________________________");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|          0000000");
			System.out.println("|          0000000");
			System.out.println("|          0000000");
			System.out.println("|             |");
			System.out.println("|   ==========|==========");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|           || ||");
			System.out.println("|          ||   ||");
			System.out.println("|         ||     ||");
			System.out.println("|        ||       ||");
			System.out.println("|       ||         ||");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_______________________");
			
	
			break;
		

		default:
			break;
		}
	}
	public static void inicializarVectores( String palabra,String vPalabra [], String vAciertos [], vFallos[]);
	
	public static boolean comprobarLetraPalabra(String letra, String palabra) {
		boolean encontrado = false;
		if(letra == Length.palabra)
		
		return encontrado;
	}
	
	public static void main(String[] args) {
		// Vidas totales 8
		Scanner leer = new Scanner(System.in)
;		int vidas = 8;
		String palabraSecreta = "Juan";
		String letra;
		String vPalabra [], vAciertos [], vFallos[];
		vPalabra[]
		
		//Estructura general del juego
		do {
			//1ª Preguntar letra
			System.out.println("Dime una letra");
			letra = leer.next();
			
			//2ª Comprobar si la letra está en la palabra
			//3ª Dibujar muñeco
			dibujarMuneco(vidas);
			//4ª Dibujar aciertos y errores
			vidas--;
		}while(vidas>=0);

	}

}
