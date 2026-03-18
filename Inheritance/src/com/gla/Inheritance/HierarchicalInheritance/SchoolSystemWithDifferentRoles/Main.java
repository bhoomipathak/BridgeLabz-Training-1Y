package com.gla.Inheritance.HierarchicalInheritance.SchoolSystemWithDifferentRoles;
class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        Staff st = new Staff();
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
