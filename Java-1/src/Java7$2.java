public class Java7$2 {
    public static void main(String[] args) {
        int count = 0, flag = -1;
        double result = 1, i = 3;
        while ((1.0 / i) > 0.000001){
            count++;
            result += flag * (1.0 / i);
            flag = -flag;
            i += 2;
        }
        result *= 4;
        System.out.printf("result=%.5f\n", result);
    }
}
