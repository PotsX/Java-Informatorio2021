package ejerciciosComplementariosLevel2;

import java.util.*;

public class Exc6 {
	public static void main(String[] args) {
		Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> sueldoCalcu = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(35667658, "Bruno Suarez", 19, 450));
        empleados.add(new Empleado(34588901, "Kevin Gomez", 15, 455));
        empleados.add(new Empleado(33099901, "Mario Sauer", 25, 600));
        empleados.add(new Empleado(28004533, "Natalia Herrera", 30, 850));

        for (Empleado i:empleados){
            int sueldo = i.getpagoxHrs() * i.gethrsTrabj();
            sueldoCalcu.put(i.getDni(), sueldo);
            System.out.println("Empleado: " + i.getnombyape() + " - DNI: " + i.getDni() + " - Sueldo: " + sueldo);
        }
    }

    static class Empleado{
        private int dni;
        private String nombyape;
        private int hrsTrabj;
        private int pagoxHrs;

        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora){
            this.dni = dni;
            this.nombyape = nombre;
            this.hrsTrabj = horasTrabajadas;
            this.pagoxHrs = valorHora;
        }

        public int getDni() {
            return dni;
        }

        public String getnombyape() {
            return nombyape;
        }
        
        public int gethrsTrabj() {
            return hrsTrabj;
        }

        public int getpagoxHrs() {
            return pagoxHrs;
        }
    }
}
