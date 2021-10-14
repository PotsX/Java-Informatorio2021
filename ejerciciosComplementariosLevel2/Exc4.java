package ejerciciosComplementariosLevel2;

import java.util.*;

public class Exc4 {
	public static void main(String[] args) {
        
        ArrayList<String> nombresEstudiantes = new ArrayList<>();
        
        nombresEstudiantes.add("Juan");
        nombresEstudiantes.add("Carlos");
        nombresEstudiantes.add("Pablo");
        nombresEstudiantes.add("Rodrigo");
        nombresEstudiantes.add("Daniel");
        nombresEstudiantes.add("Jorge");
        nombresEstudiantes.add("Demian");
        nombresEstudiantes.add("Facundo");
        nombresEstudiantes.add("Agustin");
        nombresEstudiantes.add("Mauro");
        nombresEstudiantes.add("Eduardo");
        nombresEstudiantes.add("Exequiel");
        
        List<String> primerCurso = nombresEstudiantes.subList(0, 4);
        List<String> segundoCurso = nombresEstudiantes.subList(4, 8);
        List<String> tercerCurso = nombresEstudiantes.subList(8, 12);
        
        System.out.println(primerCurso);
        System.out.println(segundoCurso);
        System.out.println(tercerCurso);

    }
    public static ArrayList<String> agregarNombres(ArrayList<String> nombres) {
           Scanner scan = new Scanner(System.in);

           for (int i = 1; i == 12; i++) {
               System.out.print("Ingrese el nombre: ");
               nombres.add((scan.nextLine()));
           }
           return nombres;
            
        }
}
