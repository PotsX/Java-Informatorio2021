package ejerciciosComplementariosLevel2;

import java.util.*;

public class Exc5 {
	public static void main(String[] args) {
        
        ArrayList<Integer> hrsTrabaj = new ArrayList<>();
        ArrayList<Integer> valorXHr = new ArrayList<>();
        ArrayList<Integer> totalFinal = new ArrayList<>();
        
        
        hrsTrabaj.add(6);
        hrsTrabaj.add(7);
        hrsTrabaj.add(8);
        hrsTrabaj.add(4);
        hrsTrabaj.add(5);
        valorXHr.add(350);
        valorXHr.add(345);
        valorXHr.add(550);
        valorXHr.add(600);
        valorXHr.add(320);

        
        for (Integer i = 0; i < hrsTrabaj.size(); i++) {
            totalFinal.add(hrsTrabaj.get(i)*valorXHr.get(i));
        }
        
        System.out.println(totalFinal);
        
        long totalACobrar= totalFinal.stream()
                  .mapToLong(o -> o)
                  .sum();
            System.out.println("Total Final: $ "+totalACobrar);
        

    }
}
