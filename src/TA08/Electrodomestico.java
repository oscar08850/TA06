package TA08;

import TA08.Color;

public class Electrodomestico {
	// Atributos//

	private double precioBase = 100;

	private String color = "Blanco";

	private char consumoEnergetico = 'F';

	private double peso = 5;



	// Constructores ///
	public Electrodomestico() {
		}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = validaColor(color);
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	private String validaColor(String color) {
		if (color.equals(Color.Azul)) {
			
			return null;
		}
		else {
			return "blanco";
		}
			
			
	}

	// Constructores
	

	public static String Color(int i) {
		String color;
		switch (i) {
		case 1:
			return Color.Blanco.toString();
			
			break;
		case 2:
			return Color.Negro.toString();
			

		default:
			break;
		}
		
	}
}
