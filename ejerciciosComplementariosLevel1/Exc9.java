package ejerciciosComplementariosLevel1;

import java.util.Scanner;

public class Exc9 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un String");
        String texto = scan.nextLine();
        
        System.out.println("Que letra desea contar?");
        String letra = scan.next();
        scan.close();
        
        
        Exc9.contarLetra(texto, letra);

    }
    static int i;

    static void contarLetra(String txt, String ascci) {
        int cantidad = 0;
        for(i=0;i<txt.length();i++) {
            int ch=txt.charAt(i);
            int ch2=ascci.charAt(0);
            if(ch==ch2 || ch==(ch2-32) || ch==(ch2+32)) {
                cantidad=cantidad+1;
            } 
        }
        System.out.println(String.format("Se repite %s veces",cantidad));
    }
}

