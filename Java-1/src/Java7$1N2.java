public class Java7$1N2 {
    public static void main(String[] args) {
        int i,j,k,a;
        for(i=1;i<8;i++){
            for(j=1;j<8;j++){
                for(k=1;k<8;k++){
                    for(a=1;a<8;a++){
                        if(a+k+j+i==10){
                            System.out.printf("%d ",a+10*k+100*j+1000*i);
                        }
                    }
                }
            }
        }
    }
}
