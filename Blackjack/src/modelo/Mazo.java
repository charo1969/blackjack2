package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Carta.Palo;

public class Mazo {
	
	/**
	 * Creamos un ArrayList.
	 */

	protected List<Carta> cartas; 
	
	/**
	 * constructor sin parámetros hacemos dos bucles for 
	 * para recorrer los palos y las cartas del palo
	 * esto genera un mazo de cartas.
	 */
	public Mazo() {
		cartas = new ArrayList<>();		
		for (Palo palo : Palo.values()) {
			for(int i =1; i<=13; i++) {
				Carta c = new Carta(palo, i);
				cartas.add(c);
			}
			
		}
	}
	
	
	public void barajar() {
		Collections.shuffle(cartas);
	}

	/**
	 * modificar el toString crear un bucle para mostrar las cartas una a una
	 */
	@Override
	public String toString() {
		
		String texto = "";
		for (Carta carta : cartas) {
			
			texto = texto + carta + "\n"; 
			
		}
		
		return texto;
	}
	
	/**
	 * solicito carta lo almacena en c y nos cargamos la carta del mazo
	 * @return c
	 */
	public Carta solicitarCarta() {
		Carta c = cartas.get(0); // empezamos desde el principio.
		cartas.remove(0);
		return c;
		
	}
	/* otra forma es empezando por el final
	 * public Carta solicitarCarta(){
	 * Carta c = cartas.get(cartas.size()-1);
	 * cartas.remove(cartas.size()-1;
	 * return c;
	 * 
	
	*/


	/**
	 * invocar metodo main para hacer pruebas.
	 * @param args
	 */
	/*public static void main(String[] args) {
		Mazo m = new Mazo();
		System.out.println(m);
		
		m.barajar();
		System.out.println(m);
		Carta c = m.solicitarCarta();
		System.out.println("La carta es "+c);
		System.out.println(m);
		
		
	}*/
}
