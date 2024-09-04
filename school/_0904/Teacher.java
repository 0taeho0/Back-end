package _0904p;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Person {

    private String name;
    private String subject;
    private int experience;
    private List<Student> students;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
        students = new ArrayList<>(); // 리스트 초기화 작업
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // 메서드
    public void addStudent(Student student) {
        students.add(student);
        student.setTeacher(this); // 학생에게 교사를 할당
    }

    public void showStudents() {
        System.out.println(name + " teaches the following students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience);
    }


}
