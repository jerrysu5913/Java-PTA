public class Java7$1 {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 1000; i < 8000; i++){
            int a = i / 1000;
            int b = i / 100 % 10;
            int c = i / 10 % 10;
            int d = i % 10;
            if(b == 0 || c == 0 || d == 0){
                continue;
            }
            else if(a + b + c + d == 10){
                System.out.print(i+" ");
            }
            else{
                continue;
            }
        }
    }
}
