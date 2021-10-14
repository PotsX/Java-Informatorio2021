package ejerciciosComplementariosLevel1;
import java.util.Scanner;

public class Exc7 {

	static void UpCase(String txt) {
		for (int i = 0; i < txt.length(); i++) {
			int ch = txt.charAt(i);
			if (ch > 64 && ch < 91) {
				System.out.print((char) ch);
			} else if (ch > 96 && ch < 123) {
				ch = ch - 32;
				System.out.print((char) ch);
			}
			if (ch == 32)
				System.out.print(" ");
		}
	}

	public static void main(String args[]) {
		System.out.println("Ingrese una Palabra");

		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		scan.close();

		Exc7.UpCase(text);
	}
}
