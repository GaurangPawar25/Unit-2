class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        return "F";
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student[] students = {
                new Student(101, "Alice", 95),
                new Student(102, "Bob", 85),
                new Student(103, "Charlie", 72),
                new Student(104, "David", 58)
        };

        for (Student s : students) {
            s.displayDetails();
        }
    }
}
