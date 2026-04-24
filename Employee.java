
class Employee {
    int empId;
    String name;

    Employee(int id, String name) {
        this.empId = id;
        this.name = name;
    }

    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}

class Manager extends Employee {
    String department;

    Manager(int id, String name, String dept) {
        super(id, name);
        department = dept;
    }

    String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}