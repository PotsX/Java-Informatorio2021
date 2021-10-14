package ejerciciosComplementariosLevel1;

import java.util.*;

public class Exc8 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre y apellido:");
        String nombre = scan.nextLine();
        
        System.out.println("Edad:");
        Integer edad = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Dirección:");
        String direccion = scan.nextLine();
        
        System.out.println("Ciudad:");
        String ciudad = scan.nextLine();
        
        scan.close();
        
        System.out.println(String.format("%s - %s - %s - %s", ciudad, direccion, edad, nombre));

    }

}

