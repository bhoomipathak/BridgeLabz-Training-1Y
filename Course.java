
class Course {
    int courseId;
    String courseName;
    double price;
    static String platformName = "LearnHub";

    Course(int id, String name, double price) {
        courseId = id;
        courseName = name;
        this.price = price;
    }

    double calculateFee() {
        return price;
    }
}

class FreeCourse extends Course {
    FreeCourse(int id, String name) {
        super(id, name, 0);
    }

    double calculateFee() {
        return 0;
    }
}

class PaidCourse extends Course {
    PaidCourse(int id, String name, double price) {
        super(id, name, price);
    }
}

class DiscountedCourse extends Course {
    DiscountedCourse(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateFee() {
        return price - (price * 0.3);
    }
}