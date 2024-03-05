import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        Student student = null;  
        int choice;  
        int extraActivityCount = 0;  
  
        do {  
            System.out.println("Enter student ID:");  
            String studentID = scanner.nextLine();  
  
            System.out.println("Enter student name:");  
            String studentName = scanner.nextLine();  
  
            System.out.println("Enter the number of extra activities:");  
            extraActivityCount = scanner.nextInt();  
            scanner.nextLine(); // Consume the newline character left after nextInt()  
  
            student = new Student(studentID, studentName, extraActivityCount);  
  
            for (int i = 0; i < extraActivityCount; i++) {  
                System.out.println("Enter extra activity #" + (i + 1) + ":");  
                String activity = scanner.nextLine();  
                student.addExtraActivity(i, activity);  
            }  
  
            System.out.println("Do you want to enter details for another student? (1 for yes, 0 for no):");  
            choice = scanner.nextInt();  
            scanner.nextLine(); // Consume the newline character  
        } while (choice == 1);  
  
        System.out.println("Student details:");  
        System.out.println(student);  
  
        scanner.close();  
    }  
}