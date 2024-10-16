package review;

public class main {
    public static void main(String[] args){
        Student student1 = new Student("Aluice", 10,"512345");
        Student student2 = new Student("Bob", 11,"554321");
        Student student3 = new Student("Charile", 12,"567890");

        Teacher teacher1 = new Teacher("Mr. Saith","Math",5);
        Teacher teacher2 = new Teacher("Ms. johnson","English",10);

        // 교사에게 학생 추가
        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student3);

// 정보출력
        System.out.println("=== Teacher Info ===");
        teacher1.showInfo();
        teacher1.showStudents();
        teacher1.teach();

        System.out.println();
        teacher2.showInfo();
        teacher2.showStudents();
        teacher2.teach();

        System.out.println("\n=== Student Info ===");
        student1.showInfo();
        System.out.println();
        student2.showInfo();
        System.out.println();
        student3.showInfo();
    }
}