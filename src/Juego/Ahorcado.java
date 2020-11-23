package Juego;

import java.util.Scanner;



public class Ahorcado {
	public static void dibujarMuneco(int vidas, String palabraSecreta) {
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
			System.out.println("|          ___|___");
			System.out.println("|         |  o o |");
			System.out.println("|         |   /  |");
			System.out.println("|         |___-__|");
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
			System.out.println("|          ___|___");
			System.out.println("|         |  o o |");
			System.out.println("|         |   /  |");
			System.out.println("|         |___-__|");
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
			System.out.println("|          ___|___");
			System.out.println("|         |  o o |");
			System.out.println("|         |   /  |");
			System.out.println("|         |___-__|");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|            | |");
			System.out.println("|           |   |");
			System.out.println("|          |     |");
			System.out.println("|         |       |");
			System.out.println("|        |         |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_______________________");
	
			break;
		case 1:
			System.out.println("________________________");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|          ___|___");
			System.out.println("|         |  x x |");
			System.out.println("|         |   /  |");
			System.out.println("|         |___o__|");
			System.out.println("|             |");
			System.out.println("|   ==========|==========");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|            | |");
			System.out.println("|           |   |");
			System.out.println("|          |     |");
			System.out.println("|         |       |");
			System.out.println("|        |         |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_______________________");
			
			System.out.println("Has perdido");
			System.out.println("La palabra secreta era: " + palabraSecreta);
			break;
		
		

		default:
			break;
		}
	}
	public static boolean comprobarLetraPalabra(String vPalabraSecreta[], String letra) {
		boolean encontrado=false;
		
		return encontrado;
	}
	
	public static void inicializarVectores(String palabra, String vPalabraSecreta[], String vAciertos[],String vFallos[]) {
		for (int i = 0; i < vFallos.length; i++) {
			vFallos[i] = "_";
		}
		for (int i = 0; i < vPalabraSecreta.length; i++) {
			//Troce,boolean encontradoar la palabra en letras al vector
			vPalabraSecreta[i] = palabra.substring(i, i+1);
			vAciertos[i] = "_";
		}
		
		
	}
	
	public static void dibujarAciertorErrores(String[] vFallos, String[] vAciertos) {
		
		//Imprimir los fallos
		System.out.println("Fallos cometidos:");
		for (int i = 0; i < vFallos.length; i++) {
			if (!vFallos[i].equals("_")) {
				System.out.print(vFallos[i] + " ");
			}
		}
		
		//System.out.println("");
		System.out.println("\n�Palabra Secreta!");
		//Imprimir los aciertos
		for (int i = 0; i < vAciertos.length; i++) {
			System.out.print(vAciertos[i]+ " ");
		}
	}
	
	public static int comprobarLetraIntroducida(int vidas, String letra, String[] vPalabraSecreta, String[] vAciertos,
			String[] vFallos) {
		
		boolean encontrado = false;
		
		for (int i = 0; i < vPalabraSecreta.length; i++) {
			if (letra.equalsIgnoreCase(vPalabraSecreta[i])) {
				vAciertos[i] = letra;
				encontrado = true;
			} 
		
		}
		if (encontrado == false) {
			for (int i = 0; i < vFallos.length; i++) {
				if (vFallos[i].equalsIgnoreCase("_")) {
					vFallos[i]=letra;
					vidas --;
					break;
				}
			}
		}
		return vidas;
	}
	
	public static boolean heGanado(String vAciertos[]) {
		
		for (int i = 0; i < vAciertos.length; i++) {
			if (vAciertos[i].equals("_")) {
				return false;
				
			}
		}
		return true ;
	}

	public static void main(String[] args) {
		// Vidas totales 8
		Scanner leer = new Scanner(System.in);
		int vidas = 8;
		String palabraSecreta = "Kizo";
		String letra;
		String vPalabraSecreta[], vAciertos[], vFallos[];
		vPalabraSecreta = new String[palabraSecreta.length()];
		vAciertos = new String[palabraSecreta.length()];
		vFallos = new String[vidas];
		inicializarVectores(palabraSecreta, vPalabraSecreta, vAciertos, vFallos);
		
		//Estructura general del juego
		do {
			//1ª Preguntar letra
			System.out.println("\nDime una letra");
			letra = leer.next();
			
			//2ª Comprobar si la letra esta� en la palabra
			vidas = comprobarLetraIntroducida( vidas, letra, vPalabraSecreta, vAciertos,vFallos);
			//3ª Dibujar muñeco
			dibujarMuneco(vidas,palabraSecreta);
			//4ª Dibujar aciertos y errores
			dibujarAciertorErrores(vFallos, vAciertos);
			
		}while(vidas>=0 && heGanado(vAciertos)== false);
		

	}

}
