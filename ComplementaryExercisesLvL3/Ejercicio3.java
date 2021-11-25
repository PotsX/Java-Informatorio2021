package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> names = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        List<String> matches = names.stream()
                .filter(firstLetter -> firstLetter.startsWith("B")||firstLetter.startsWith("b"))
                .collect(Collectors.toList());
        System.out.println(matches.size());
    }
}