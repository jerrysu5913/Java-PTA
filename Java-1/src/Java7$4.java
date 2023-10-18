import java.util.Arrays;
import java.util.Scanner;
public class Java7$4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i < num; i++){
            for (int j = 2; j < num; j++){
                if (i % j == 0 && num % j == 0){
                    break;
                }
                else if (j == num - 1){
                    System.out.print(i + "/" + num + ",");
                }
            }
        }
    }
}
