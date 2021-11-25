package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("Hola");
        text.add(null);
        text.add("Informatorio");
        text.add("");
        List<String> textNoNulls = text.stream()
                .filter(notNull-> notNull!=null&& !notNull.equals(""))
                .collect(Collectors.toList());
        System.out.println(textNoNulls);
    }
}