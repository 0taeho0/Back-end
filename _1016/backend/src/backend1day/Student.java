package backend1day;

public class Student {
    String name;
    String grade;
    String studentId;
    String teacher;

    public Student(String name, String grade, String studentId) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
    }

    void study(String name) {
        System.out.printf("%s is studying",name);
        System.out.println();
    }

    void showInfo(String name, String grade, String studentId, String teacher){
        System.out.printf("name : %s",name);
        System.out.printf("grade : %s",grade);
        System.out.printf("studentId : %s",studentId);
        if(teacher != null) {
            System.out.printf("teacher : %s", teacher);
            System.out.println();
        }
    }



}
