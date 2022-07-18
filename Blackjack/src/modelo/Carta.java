package modelo;

public class Carta {
	
	// Creamos un enum
	
	enum Palo{
		TREBOL, DIAMANTES, CORAZONES, PICAS;
	};
	
	// atributos
	private Palo palo;
	private int numeroCarta;
	
	
	//constructor parametrizado
	public Carta(Palo palo, int numeroCarta) {
		
		this.palo = palo;
		
		if(numeroCarta >=1 && numeroCarta <=13) {
			this.numeroCarta = numeroCarta;
		}
		
		
	}

	// getters
	public Palo getPalo() {
		return palo;
	}


	public int getNumeroCarta() {
		return numeroCarta;
	}
	// metodo
	
	public int getValor() {
		if(this.numeroCarta == 11) {
			return 11;
		}else if(this.numeroCarta>10) {
			return 10;
		}else {
			return this.numeroCarta;
		}
		
	}
	// metodo
	public String mostrarNumero() {
		if(this.numeroCarta == 1) {
			return "AS";
		}else if(this.numeroCarta == 11) {
			return "J";
		}else if(this.numeroCarta == 12) {
			return "Q";
		}else if(this.numeroCarta == 13) {
			return "K";
		}else {
			return Integer.toString(numeroCarta);
		}
	}
	// toString
	@Override
	public String toString() {
		return "[" + this.mostrarNumero() + " - " + this.palo + "]";
	}

	
	
	
	
}
