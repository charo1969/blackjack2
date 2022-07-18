package principal;

import java.util.Scanner;

import modelo.Mano;
import modelo.Mazo;

public class Juego {


	public static void main(String[] args) {
	
		Mazo mazo = new Mazo();
		Mano jugador = new Mano();
		Mano banca = new Mano();

		System.out.println("Barajando carta ...");
		
		mazo.barajar();
		
		System.out.println("Repartiendo cartas iniciales ...");
		jugador.pedirCarta(mazo);
		System.out.println("Jugador: "+jugador);
		
		banca.pedirCarta(mazo);
		System.out.println("Banca "+banca);
		
		System.out.println("Repartiendo cartas iniciales ...");
		jugador.pedirCarta(mazo);
		System.out.println("Jugador: "+jugador);
		
		banca.pedirCarta(mazo,false);
		System.out.println("Banca:  "+banca);
		
		

		Scanner teclado = new Scanner(System.in);
		int opcion;

		do {
			// pedimos por teclado una carta y añade la mano al jugador
			System.out.println("Quieres carta? (1-si, 0-no)");

			opcion = teclado.nextInt();

			if (opcion == 1) {
				jugador.pedirCarta(mazo);
				System.out.println("Tienes en tu mano \n" + jugador);

			}

		} while (opcion != 0 && !jugador.finDeJuego());
		
		/* creamos la banca para jugar con el jugador y damos dos cartas al jugador y la banca
			la banca solo descubre una , el jugador las dos*/
		
		
		System.out.println("Juega la banca...");
		banca.descubrir();
		System.out.println("Cartas de la banca: "+banca);

		
		if(jugador.valorMano()>21){
			System.out.println("Gana la banca");
		}else {
			do {
				System.out.println("Pidiendo carta");
				banca.pedirCarta(mazo);
				System.out.println(banca);
			}while(banca.valorMano()<=16);
			
			if(jugador.valorMano()>banca.valorMano() || banca.valorMano()>21) {
				System.out.println("Enhorabuena has ganado: "+jugador);
			}else if (jugador.valorMano()==banca.valorMano()) {
				System.out.println("Empate");
				System.out.println("jugador: "+jugador);
				System.out.println("Banca"+ banca);
			}else {
				System.out.println("Gana la banca "+banca);
			}
		}

		//Con solo el jugador.
		
		
		/**do {
			System.out.println("Pidiendo carta");
			banca.pedirCarta(mazo);
		}while (banca.valorMano()<=16);
		
		
		System.out.println("Fin de juego.Tu mano es\n" + jugador);

		if (jugador.valorMano() == 21) {
			System.out.println("Campeon. Has conseguido El Blackjack(21)");
		} else if (jugador.valorMano() > 21) {
			System.out.println("Te has pasado");
		} else {
			System.out.println("Te has plantado con " + jugador.valorMano());
		}*/

	}
}
