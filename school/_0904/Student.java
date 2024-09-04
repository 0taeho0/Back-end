package _0904p;

public class Student implements Person{
    // 속성(필드)
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

    // studentId의 경우 값이 바뀌면 안되기 때문에 getter만 생성
    public String getStudentId() {
        return studentId;
    }

    // 나머지 필드값을 getter와 setter 모두 만들어준다.


    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // 메서드
    public void study() {
        System.out.println(name + " is studying.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentId);
        if (teacher != null) {
            System.out.println("Teacher: " + teacher.getName());
        } else {
            System.out.println("No teacher assigned.");
        }
    }
}
