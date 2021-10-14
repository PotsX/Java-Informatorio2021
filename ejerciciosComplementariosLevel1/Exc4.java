package ejerciciosComplementariosLevel1;
import java.util.*;

public class Exc4 {

	public static void main(String[] args) {
		System.out.println("Ingresa un número entero:");

		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		scan.close();

		int resultado = fact(numero);
		System.out.println(String.format("El facotrial de %d es: %d", numero, resultado));

	}

	private static int fact(int numb1) {
		if (numb1 <= 1)
			return numb1;
		return numb1 * fact(numb1 - 1);
	}
}
