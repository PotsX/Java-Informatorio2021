package ejerciciosComplementariosLevel2;

import java.util.*;

public class Exc2 {
	public static void main(String[] args) {
        
        ArrayList<Integer> numerosEnteros = new ArrayList<>();
        numerosEnteros = agregarElementos(numerosEnteros);
        imprimirElementos(numerosEnteros);
        numerosEnteros = agregarInicioFinal(numerosEnteros);
        imprimirElementos(numerosEnteros);
        
    }
    
     public static ArrayList<Integer> agregarElementos(ArrayList<Integer> numeros) {
            Scanner scan = new Scanner(System.in);

            for (int i = 1; i <= 5; i++) {
                System.out.print("Ingrese un número entero: ");
                numeros.add(Integer.valueOf(scan.nextLine()));
            }
            return numeros;
        }

        public static void imprimirElementos(ArrayList<Integer> numerosImprimir) {
            for (Integer numero: numerosImprimir) {
                System.out.print(numero+" ");
            }
            int cantidad = numerosImprimir.size();
            System.out.println("\nEl tamaño de la lista es de: "+cantidad);
        }

        public static ArrayList<Integer> agregarInicioFinal(ArrayList<Integer> listaAAgregar){
            Scanner scan = new Scanner(System.in);
            System.out.print("Ingrese el elemento que quiere agregar al inicio: ");
            listaAAgregar.add(0, Integer.valueOf(scan.nextLine()));
            System.out.print("Ingrese el elemento que quiere agregar al final: ");
            listaAAgregar.add(Integer.valueOf(scan.nextLine()));
            return listaAAgregar;
        }

}