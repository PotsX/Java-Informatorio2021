package EjerciciosComplementariosLevel3;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String lastName;
    String name;
    LocalDate birthDate;
    protected Student(String name , String lastName, LocalDate birthDate) {
        this.lastName = lastName;
        this.name = name;
        this.birthDate = birthDate;
    }
    protected String getLastName() {
        return lastName;
    }
    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }
    protected String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected LocalDate getBirthDate() {
        return birthDate;
    }
    protected void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    protected Integer getAge() {
    	LocalDate today = LocalDate.now();
    	LocalDate birthday = birthDate;
    	Period diff = Period.between(birthday, today);
	return diff.getYears();
    }
}
public class Ejercicio5 {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Pedro", "Gonzales", LocalDate.of(1979,12,2)),
                new Student("Juan", "Pérez", LocalDate.of(1984,2,29)),
                new Student("Jhon", "Smith", LocalDate.of(1995,8,28)),
                new Student("Jane", "Doe", LocalDate.of(2000,4,24)),
                new Student("Fulano", "Mengano", LocalDate.of(1998,11,10))
        );
        Map<String, Integer> mapStudent = students.stream()
                .collect(Collectors.toMap(studentName -> '\"'+studentName.getLastName()+" "+studentName.getName()+'\"',
                        studentAge -> studentAge.getAge()));
        System.out.println(mapStudent);
    }
}
