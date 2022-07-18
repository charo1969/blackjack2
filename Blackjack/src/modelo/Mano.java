package modelo;

import java.util.ArrayList;

public class Mano extends Mazo {
	
	/**
	 * creamos un constructor para acceder al arrayList.
	 */
	public Mano() {
		this.cartas = new ArrayList<>();
	}
	
	
	/**
	 * vamos cogiendo cartas y la introducimos en la variable suma
	 * @return
	 */
	
	public int valorMano() {
		int suma = 0;
		 for (Carta carta : cartas) {
			 suma = suma + carta.getValor();
		
		}
		 return suma;
		
	}
	
	public int valorManoVisibles() {
		int suma = 0;
		 for (Carta carta : cartas) {
			
			if(carta.isVisible()) {
				suma = suma + carta.getValor();
			}
		
		}
		 return suma;
		
	}
	
	public void descubrir() {
		for (Carta carta : cartas) {
			carta.setVisible(true);
		}
	}
	
	/**
	 * metodo booleano
	 */
	
	public boolean finDeJuego() {
		if(valorMano()>=21 ) {
			return true;
		}
		return false;
		
		// return valorMano() >=21;
	}
	
	@Override
	public String toString() {
		return "Valor de la Mano: " + valorManoVisibles() + "\n" + super.toString();
		
	}
	
	/**
	 * metodo pedir carta y lo a�adimos a la mano.
	 */
	public void pedirCarta(Mazo m) {
		if(!finDeJuego()) {
			Carta c = m.solicitarCarta();
			this.cartas.add(c);
			
		}
		
		
	}
	
	public void pedirCarta(Mazo m,boolean visible) {
		if(!finDeJuego()) {
			Carta c = m.solicitarCarta();
			c.setVisible(visible);
			this.cartas.add(c);
			
		}
		
		
	}
	
	
	

	
}
