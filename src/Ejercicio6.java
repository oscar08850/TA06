import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {

		int numero = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce un número para ver cuantas cifras tiene: "));
		JOptionPane.showMessageDialog(null, "El número: " + numero + " en binario es: " + dameCifras(numero));

	}

	private static int dameCifras(int numero) {
		
		//Falta hacerlo

		return 3;
	}

}
