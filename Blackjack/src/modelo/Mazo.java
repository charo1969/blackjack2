package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.Carta.Palo;

public class Mazo {
	
	/**
	 * Creamos un ArrayList.
	 */

	private List<Carta> cartas; 
	
	//constructor sin parámetros
	public Mazo() {
		cartas = new ArrayList<>();		
		for (Palo palo : Palo.values()) {
			for(int i =1; i<=13; i++) {
				Carta c = new Carta(palo, i);
				cartas.add(c);
			}
			
		}
	}
}
