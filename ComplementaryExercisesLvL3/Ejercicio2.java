package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> pot = numbers.stream()
                .map(squarednumb -> squared(squarednumb,2))
                .collect(Collectors.toList());
        System.out.println(pot);
    }
    public static int squared(int numbres, int pot){
        int res = 1;
        for (int i = 1; i <= pot; i++){
            res *=numbres;
        }
        return res;
    }
}