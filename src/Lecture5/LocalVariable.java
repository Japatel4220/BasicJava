package Lecture5;

public class LocalVariable {

    int a = 20; // global variable

    static int b = 40; // static variable

    public static void main(String[] args) {
        int a = 10; // local variable
        System.out.println(a);
        System.out.println(b);

    }

    public void red(){
        int a = 25;
        System.out.println(a);
        System.out.println(b);
    }

    public void blue(){
        System.out.println(a);
        System.out.println(b);


    }
}
