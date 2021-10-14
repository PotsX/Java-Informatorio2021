package ejerciciosComplementariosLevel2;

import java.util.*;

public class Exc6 {
	public static void main(String[] args) {
		Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> diccionario = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(42667658, "Gonzalo Morales", 160, 450));
        empleados.add(new Empleado(34588901, "Kevin Gomez", 130, 445));
        empleados.add(new Empleado(33099901, "Belén Cáceress", 190, 410));
        empleados.add(new Empleado(29004533, "Chiara Barboza", 300, 398));

        for (Empleado i:empleados){
            int sueldo = i.getValorHora() * i.getHorasTrabajadas();
            diccionario.put(i.getDni(), sueldo);
            System.out.println("Empleado: " + i.getNombre() + " - DNI: " + i.getDni() + " - Sueldo: " + sueldo);
        }
    }

    static class Empleado{
        private int dni;
        private String nombre;
        private int horasTrabajadas;
        private int valorHora;

        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora){
            this.dni = dni;
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.valorHora = valorHora;
        }

        public int getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }
        
        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public int getValorHora() {
            return valorHora;
        }
    }
}
