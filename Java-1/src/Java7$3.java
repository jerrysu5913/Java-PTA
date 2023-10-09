import java.util.Scanner;
public class Java7$3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count=0;
        while(num != 1){
            if(num % 2 != 0){
                num = 3 * num + 1;
            }
            else{
                num /= 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
