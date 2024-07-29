import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        String[] subjects = new String[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjects[i] = scanner.next();
        }

        System.out.print("Enter the number of periods: ");
        int numPeriods = scanner.nextInt();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        System.out.println("Timetable for the week:");
        for (String day : days) {
            System.out.println("\n" + day + ":");
            System.out.println("-------------------------------");
            for (int i = 1; i <= numPeriods; i++) {
                Random random = new Random();
                int subjectIndex = random.nextInt(subjects.length);
                System.out.print("| Period " + i + ": " + subjects[subjectIndex] + "\t");
                if (i % 4 == 0) {
                    System.out.println("\n-------------------------------");
                }
            }
            System.out.println("\n-------------------------------");
        }
    }
}