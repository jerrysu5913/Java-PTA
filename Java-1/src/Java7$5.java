import java.util.Scanner;
public class Java7$5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1) {
                    System.out.print("*");
                    for (int k = 1; k <= num - 1; k++) {
                        System.out.print(" ");
                    }
                }
                else if (j == 1) {
                    System.out.print("*");
                }
                else if (j == 2 * i - 1){
                    System.out.print("*");
                    for(int k = i; k <= num - 1; k++) {
                        System.out.print(" ");
                    }
                }
                else if (i == num) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}