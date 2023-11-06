class Number {
    int i;
    public Number(int ii) { i=ii; }
}
public class Main {
    public static void main(String[] args) {
        Number[] a = new Number[5];
        for ( int i=0; i<a.length; i++ ) a[i] = new Number(i);
        for ( int i=0; i<2; i++ )
            for ( Number n : a ) {
                System.out.print(n.i);
                n.i = 5-n.i;
            }
    }
}