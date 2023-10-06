package Lecture4;

public class ComparisonOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 7;

        boolean myAnswer = a==b;
        System.out.println(myAnswer);

        System.out.println(a==b);

        System.out.println(a!=c);

        System.out.println(a>b);
        System.out.println(b>a);

        System.out.println(c>a);
        System.out.println(a>c);

        System.out.println(a>=b);
        System.out.println(b>=c);
    }
}
