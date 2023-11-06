public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.age= 19;
        p.name = "lili";
        Person q = new Person();
        q.age = 20;
        q.name = "lucy";
        System.out.println(p.toString());
        System.out.println(q.toString());
    }
}

class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return "this person is " + name + ",her age is " + age;
    }
}