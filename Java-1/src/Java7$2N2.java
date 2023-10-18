public class Java7$2N2 {
    public static void main(String[] args) {
        int flag=1;
        double sum=0,j=1;
        for(int i=1;1/j>=0.000001;i++){
            sum+=1/j*flag;
            j=i*2+1;
            flag=-flag;
        }
        System.out.printf("result=%.5f\n",sum*4);
    }
}
