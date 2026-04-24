
class Student {
    int rollNo;
    String name;
    int marks;

    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    String calculateGrade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else return "C";
    }
}

class EngineeringStudent extends Student {
    String branch;

    EngineeringStudent(int r, String n, int m, String b) {
        super(r, n, m);
        branch = b;
    }

    String getDetails() {
        return name + " - " + branch;
    }
}