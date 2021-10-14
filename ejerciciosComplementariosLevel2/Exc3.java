package ejerciciosComplementariosLevel2;

import java.util.*;

public class Exc3 {
	public static void main(String[] args) {
        
        ArrayList<String> numeracionCartas = new ArrayList<>();
        for (int i = 2; i < 15; i++) {
            numeracionCartas.add(String.format("%s",i));
        }
        System.out.println(numeracionCartas);
        
        Collections.reverse(numeracionCartas);
        System.out.println(numeracionCartas);
        
        Collections.shuffle(numeracionCartas);
        System.out.println(numeracionCartas);
    }
}
