
class Student {
    int rollno;
    String name;
    int marks1, marks2, marks3;

    
    Student(int rollno, String name, int marks1, int marks2, int marks3) {
        this.rollno = rollno;
        this.name = name;
        this.marks1 = validateMarks(marks1);
        this.marks2 = validateMarks(marks2);
        this.marks3 = validateMarks(marks3);
    }

   
    private int validateMarks(int marks) {
        if (marks < 0) {
            System.out.println("Warning: Marks cannot be negative. Setting to 0.");
            return 0;
        } else if (marks > 100) {
            System.out.println("Warning: Marks cannot exceed 100. Setting to 100.");
            return 100;
        }
        return marks;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    
    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    // Display student details
    void displayDetails() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + String.format("%.2f", calculatePercentage()) + "%");
      
    }
}


public class Main {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student(101, "Pragya", 92, 95, 97);
        Student s2 = new Student(102, "Riya", 91, 90, 89);
        Student s3 = new Student(103, "Siya", 72, 95, 37);

        // Display details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

