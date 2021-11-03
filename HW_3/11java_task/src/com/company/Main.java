package com.company;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Student {
    public Student(){}
    private String name;
    private Integer course;
    public Student(String name,Integer course){
        this.name = name;
        this.course = course;
    }
    public String getStudentName(){
        return name;
    }
    public Integer getStudentCourse(){
        return course;
    }
    public String setStudentName(String a){
        return name = a;
    }
    public Integer setStudentCourse(Integer b){
        return course = b;
    }
    @Override
    public String toString() {
        return "Student name is " + name +" and course he is on now is " + course;
    }
    public static Comparator<Student> compareToCourse() {
        return Comparator.comparing(Student::getStudentCourse);
    }
    public static Comparator<Student> compareToName() {
        return Comparator.comparing(Student::getStudentName);
    }
    public static void printStudents(List<Student> studentsList, Integer course){
        for (Student student : studentsList) {
            if (student.getStudentCourse().equals(course)) {
                System.out.println(student);
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        List<Student> StudList = new ArrayList<Student>();
        StudList.add(new Student("Mykola" ,4));
        StudList.add(new Student("Olha" ,6));
        StudList.add(new Student("Taras" ,5));
        StudList.add(new Student("Nazar" ,1));
        StudList.add(new Student("Mariya" ,2));
        Student.printStudents(StudList,3);
        Comparator<Student> compareByFirstNames = Student.compareToName();
        StudList.sort(compareByFirstNames);
        System.out.println("List of students sorted by name first letter:");
        for (Student student : StudList) {
            System.out.println(student);
        }
        Comparator<Student> compareByCourse = Student.compareToCourse();
        StudList.sort(compareByCourse);
        System.out.println("\nList is ordered by course");
        for (Student student : StudList) {
            System.out.println(student);
        }
    }
}