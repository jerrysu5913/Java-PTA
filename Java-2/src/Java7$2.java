import java.util.*;

public class Java7$2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            persons[i] = new Person(input[0], Boolean.parseBoolean(input[2]), Integer.parseInt(input[1]));
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(persons[i]);
        }
        Person p = new Person();
        System.out.println(p.toStr());
        System.out.println(p);
    }
}
class Person{
    private static int count = 0;
    private String name;
    private boolean gender;
    private int age;
    private int id;
    public Person() {
        System.out.println("This is constructor");
    }

    public Person(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    {
        id = count++;
        System.out.println("This is initialization block, id is " + id);
    }

    static {
        System.out.println("This is static initialization block");
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", id=" + id + "]";
    }
    public String toStr(){
        return name+","+age+","+gender+","+id;
    }
}