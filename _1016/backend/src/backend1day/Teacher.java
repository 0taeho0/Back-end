package backend1day;

public class Teacher {
    String name;
    String subject;
    String experience;
    String students[] = new String[10];

    Student s1 = new Student("Sejun", "1","10010");

    public Teacher(String subject, String name, String experience, String students) {
        this.subject = subject;
        this.name = name;
        this.experience = experience;
    }

    void addStudent(Student student) {
        int i = students.length-1;
        students[i]= name;

    }

    void showStudents(String students[]){
        for(int i=1; i<=students.length; i++){
            System.out.println(students[i]);
        }
    }

    void teach() {
        System.out.printf("%s is teaching %s",name,subject);
    }

    void showInfo(){
        System.out.printf("name : %s\nsubject : %s\n experience : %s",name, subject,experience);
        System.out.println();
    }
}
