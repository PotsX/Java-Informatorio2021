package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 4, 4, 4);
        List<Integer> res = num.stream()
                .map(factoriales -> factorial(factoriales))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(res);
    }
    public static int factorial(int num) {
        if (num < 0 ){
            System.out.print("Cannot be solved.");
            return 0;
        }
        else if (num == 0) {
            return 1;
        } 
        else {
            return num *= factorial(num - 1);
        }
    }
}