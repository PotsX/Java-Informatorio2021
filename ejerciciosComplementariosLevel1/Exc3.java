package ejerciciosComplementariosLevel1;
import java.util.*;

public class Exc3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");

		int numero = scan.nextInt();
		scan.close();

		for (int i = 1; i <= numero; i++) {
			System.out.println();
			for (int x = 1; x <= i; x++) {
				System.out.print(x);
			}
		}
	}
}
