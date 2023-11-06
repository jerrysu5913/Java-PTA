import java.util.*;
public class Java7$3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for(int i=0;i<n;i++){
            String id = scanner.next();
            String name = scanner.next();
            int age = scanner.nextInt();
            students[i] = new Student(id, name, age);
        }
        for(int i=0;i<n;i++){
            if(students[i].age>=7&&students[i].age<=60) System.out.println(students[i].toString());
            else System.out.println("bad");
        }
    }
}
class Student{
    private String id;
    private String name;
    int age;

    public Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" "+id+" "+age;
    }
}
