package _0904p;

public class Main {
    public static void main(String[] args) {
        // Student 객체 생성
        Student student1 = new Student("Alice", 10, "S12345");
        Student student2 = new Student("Bob", 11, "S54321");
        Student student3 = new Student("Charlie", 12, "S67890");

        // Teacher 객체 생성
        Teacher teacher1 = new Teacher("Mr. Smith", "Math", 5);
        Teacher teacher2 = new Teacher("Ms. Johnson", "English", 10);

        Person[] people = {teacher1, teacher2, student1, student2, student3};
        printPersonInfo(people);
        // 정보출력
    }
        private static void printPersonInfo(Person[] people){
            System.out.println("=== Person Info ===");
            for(Person person : people){
                if(person instanceof Teacher){
                    person.showInfo();
                    ((Teacher) person).showStudents();
                    ((Teacher) person).teach();
                    System.out.println();
                }else{
                    person.showInfo();
                    System.out.println();
                }
            }
        }
}
