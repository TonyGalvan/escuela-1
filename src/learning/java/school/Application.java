package learning.java.school;

import java.util.Scanner;

public class Application{
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Isaias", "1"),
                new Student("Edgar", "2"),
                new Student("Alain", "3"),
                new Student("Caleb", "4")
        };

        System.out.println("Los alumnos son...");

        Scanner scanner = new Scanner(System.in);

        for (Student student : students) {
            System.out.println(student.getName() + "-" + student.getCode());

            System.out.print("¿Asistió?: ");
            String response = scanner.next("[YNyn]");

            System.out.println(student.getName() + (response.equalsIgnoreCase("Y") ? "Si" : "No"));
        }
    }

}