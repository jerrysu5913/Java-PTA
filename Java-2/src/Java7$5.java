import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Rectangle r1 = new Rectangle(width, height);
        double width1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();
        Rectangle r2 = new Rectangle(width1, height1);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
class Rectangle {
    double width;
    double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return width+ " " + height+ " " + getArea()+ " " + getPerimeter();
    }
}