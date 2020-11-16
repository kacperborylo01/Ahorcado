package Juego;

public class Ahorcado {
	public static void dibujarMuneco(int vidas) {
		switch (vidas) {
		case 7:
			System.out.println("___________________");
			
			break;
		case 6:
			System.out.println("___________________");
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
			System.out.println("|___________________");
			
			break;
		case 5:
			System.out.println("____________________");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
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
			System.out.println("|___________________");
	
			break;
		case 4:
			System.out.println("____________________");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
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
			System.out.println("|___________________");
	
			break;
		case 3:
			System.out.println("____________________");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|             O0000");
			System.out.println("|             O0000");
			System.out.println("|             O0000");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|___________________");
	
			break;
		case 2:
			System.out.println("____________________");
			System.out.println("|               K");
			System.out.println("|               |");
			System.out.println("|               I");
			System.out.println("|             O0000");
			System.out.println("|             O0000");
			System.out.println("|             O0000");
			System.out.println("|               |");
			System.out.println("|               Z");
			System.out.println("|               |");
			System.out.println("|               0");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|___________________");
	
			break;
		case 1:
			System.out.println("____________________");
			System.out.println("|               K");
			System.out.println("|               |");
			System.out.println("|               I");
			System.out.println("|             O0000");
			System.out.println("|             O0000");
			System.out.println("|             O0000");
			System.out.println("|               |");
			System.out.println("|               Z");
			System.out.println("|               |");
			System.out.println("|               O");
			System.out.println("|             || ||");
			System.out.println("|            ||   ||");
			System.out.println("|           ||     ||");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|___________________");
	
			break;
		case 0:
			System.out.println("____________________");
			System.out.println("|               K");
			System.out.println("|               |");
			System.out.println("|               I");
			System.out.println("|             O0000");
			System.out.println("|             O0000");
			System.out.println("|             O0000");
			System.out.println("|               |");
			System.out.println("|        -------Z------");
			System.out.println("|               |");
			System.out.println("|               O");
			System.out.println("|             || ||");
			System.out.println("|            ||   ||");
			System.out.println("|           ||     ||");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|___________________");
	
			break;

		default:
			break;
		}
	}
	public static void main(String[] args) {
		// Vidas totales 8
		int vidas = 8;
		
		//Estructura general del juego
		do {
			//1ª Preguntar letra
			//2ª Comprobar si la letra está en la palabra
			//3ª Dibujar muñeco
			dibujarMuneco(vidas);
			//4ª Dibujar aciertos y errores
			vidas--;
		}while(vidas>=0);

	}

}
