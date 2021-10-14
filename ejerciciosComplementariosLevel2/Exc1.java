package ejerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc1 {
	public static void main(String args[]) {
		List<String> cities = new ArrayList<>();
		String answ;
		do {
			System.out.print("Ingrese una Ciudad Favorita: ");
			Scanner scan = new Scanner(System.in);
			String city = scan.nextLine();
			cities.add(city);
			System.out.println("Quiere ingresar otra ciudad? Si o No");
			answ = scan.nextLine();
		}while(answ.toLowerCase().equals("si"));
		System.out.println("Tus Ciudades favoritas son:");
		for (int i = 0; i < cities.size(); i++) {
			String cit = cities.get(i);
			System.out.println("#"+(i+1)+" - "+cit);
		}
	}
}