package com.gla.constructors.InstanceVsVariableAndMethod;

class Course {
    // Instance variables
    String courseName;
    int duration;
    double fee;
    // Class variable
    static String instituteName="GLA";
    Course(String name,int d,double f){
        courseName=name;
        duration=d;
        fee=f;
    }
    void displayCourseDetails(){
        System.out.println(courseName+" "+duration+" "+fee+" "+instituteName);
    }
    static void updateInstituteName(String newName){
        instituteName=newName;
    }
    public static void main(String args[]){
        Course c1=new Course("Java",6,10000);
        Course c2=new Course("Python",4,8000);
        c1.displayCourseDetails();
        Course.updateInstituteName("GLA University");
        c2.displayCourseDetails();
    }
}
