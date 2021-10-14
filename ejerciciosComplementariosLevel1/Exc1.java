package ejerciciosComplementariosLevel1;
import java.util.*;

public class Exc1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su nombre");

		String nombre = scan.nextLine();
		scan.close();

		System.out.println("Hola " + nombre);
	}
}
