package Lecture5;

public class GlobalVariable {

    int a = 40;  // Global variable

    public static void main(String[] args) {
        int a = 10; // local variable
        int b = 30;
        System.out.println(a);
        //system.out.println(b); this cannot be used because b is defined in red()
    }

    public void red() {
        int a = 25;
        System.out.println(a);
    }

    public void blue() {
        System.out.println(a);

    }
}
