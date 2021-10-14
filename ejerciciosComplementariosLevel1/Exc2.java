package ejerciciosComplementariosLevel1;
import java.util.*;

public class Exc2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese 2 valores");

		int primerNumero = scan.nextInt();
		int segundoNumero = scan.nextInt();
		scan.close();

		System.out.println(primerNumero + " + " + segundoNumero + " = " + (primerNumero + segundoNumero));
		System.out.println(primerNumero + " - " + segundoNumero + " = " + (primerNumero - segundoNumero));
		System.out.println(primerNumero + " * " + segundoNumero + " = " + (primerNumero * segundoNumero));
		System.out.println(primerNumero + " / " + segundoNumero + " = " + (primerNumero / segundoNumero));
		System.out.println(primerNumero + " % " + segundoNumero + " = " + (primerNumero % segundoNumero));

	}
}
