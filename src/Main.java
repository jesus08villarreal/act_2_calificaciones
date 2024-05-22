import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        String studentName;
        float[] studentGrades = new float[5];
        float average;
        String studentStatus;

        // Inputs
        System.out.println("Ingresa el nombre del estudiante: ");
        studentName = scanner.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa la calificación numero " + (i + 1) + " del estudiante: ");
            studentGrades[i] = scanner.nextFloat();
        }

        // Close scanner

        scanner.close();

        // Process

        average = calculateAverage(studentGrades);
        studentStatus = getStudentStatus(average);

        // Outputs

        System.out.println("Nombre del estudiante: " + studentName);
        System.out.println("Calificaciones: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + studentGrades[i]);
        }
        System.out.println("Promedio: " + average);
        System.out.println("Calificación: " + studentStatus);

    }
    public static float calculateAverage(float[] studentGrades) {
        float sum = 0;
        for (float studentGrade : studentGrades) {
            sum += studentGrade;
        }
        return sum / studentGrades.length;
    }
    public static String getStudentStatus(float average) {
        if (average >= 91) {
            return "A";
        } else if (average >= 81 && average <= 90) {
            return "B";
        } else if (average >= 71 && average <= 80) {
            return "C";
        } else if (average >= 61 && average <= 70) {
            return "D";
        } else if (average >= 51 && average <= 60) {
            return "E";
        } else {
            return "F";
        }
    }
}