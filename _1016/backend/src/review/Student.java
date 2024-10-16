package review;

public class Student{
    private String name;
    private int grade;
    private String studentId;
    private Teacher teacher;

    public Student(String name, int grade, String studentId) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
    }

    // 교사 설정 getter & setter


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    //studentId의 경우 값이바뀌며
    public String getStudentId() {
        return studentId;
    }

    //나머지 필드값을 게터세터로 모두 만들 것.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //메소드부분
    public void study(){
        System.out.println(name + "is studying");
    }
    public void showInfo(){
        System.out.println("Student Name: " + name);
        System.out.println("Grade: "+grade);
        System.out.println("Student ID: "+studentId);
        if(teacher != null) {
            System.out.println("Teacher :" + teacher);
        }
        else {
            System.out.println("No teacher assigned");
        }
    }
}
