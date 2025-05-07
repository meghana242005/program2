import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class student {
    private String name;
    private LocalDate dob;

    public student(String name, String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Change format if needed
        this.name = name;
        this.dob = LocalDate.parse(dob, formatter);
    }

    public int calculateAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + calculateAge() + " years");
    }

    public static void main(String[] args) {
        student student = new student("John Doe", "2002-05-07"); // Provide DOB in correct format
        student.displayStudentInfo();
    }
}
