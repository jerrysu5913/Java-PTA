import java.util.Scanner
public class Java6$1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //这边是你的代码

        int n = sc.nextInt();
        Object[] objects = new Object[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            switch (type) {
                case "c":
                    objects[i] = new Computer();
                    break;
                case "d":
                    objects[i] = Double.valueOf(sc.nextDouble());
                    break;
                case "i":
                    objects[i] = Integer.valueOf(sc.nextInt());
                    break;
                case "s":
                    objects[i] = sc.next();
                    break;
                default:
                    objects[i] = null;
                    break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (objects[i] != null) {
                System.out.println(objects[i]);
            }
        }

        //代码结束

        sc.close();
    }
}
