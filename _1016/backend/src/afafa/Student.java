package afafa;

import review.Teacher;

public class Student implements Person{

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void showInfo() {

    }

    private String name;
    private int grade;
    private String studentId;
    private Teacher teacher;
}
