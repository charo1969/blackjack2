/**
 * rama concartasvistas modificar el juego de blackjack.
 * para que las cartas sean visibles.
 */

package modelo;

public class Carta {

	// Creamos un enum

	enum Palo {
		TREBOL, DIAMANTES, CORAZONES, PICAS;
	};

	// atributos con boolean visible
	private Palo palo;
	private int numeroCarta;
	private boolean visible;

	// constructor parametrizado
	public Carta(Palo palo, int numeroCarta) {

		this.palo = palo;

		if (numeroCarta >= 1 && numeroCarta <= 13) {
			this.numeroCarta = numeroCarta;
		}
		this.visible = true;

	}
	// crear otro constructor con todos los parámetros incluido visible.

	public Carta(Palo palo, int numeroCarta, boolean visible) {

		this.palo = palo;

		if (numeroCarta >= 1 && numeroCarta <= 13) {
			this.numeroCarta = numeroCarta;
		}
		this.visible = visible;

	}

	// getters
	public Palo getPalo() {
		return palo;
	}

	public int getNumeroCarta() {
		return numeroCarta;
	}
	// metodo getValor con el valor de todas las cartas

	public int getValor() {
		if (this.numeroCarta == 11) {
			return 11;
		} else if (this.numeroCarta > 10) {
			return 10;
		} else {
			return this.numeroCarta;
		}

	}
	/**
	 * creamos el getter y setter de visible
	 * @return
	 */

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	// metodo mostrarNumero
	public String mostrarNumero() {
		if (this.numeroCarta == 1) {
			return "AS";
		} else if (this.numeroCarta == 11) {
			return "J";
		} else if (this.numeroCarta == 12) {
			return "Q";
		} else if (this.numeroCarta == 13) {
			return "K";
		} else {
			return Integer.toString(numeroCarta);
		}
	}

	// toString modificado para mostrar las cartas visibles si no no es visible
	@Override
	public String toString() {
		if(this.visible) {
			return "[" + this.mostrarNumero() + " - " + this.palo + "]";
		}else {
			return "[ Carta no visible ]";
		}
		
	}

}
