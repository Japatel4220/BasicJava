package Lecture8;

public class TypeCasting {
    //to store the value of one data type to different data type;
    public static void main(String[] args) {

        //byte -> short -> int -> float -> double
        //     <-

        //wide type casting -  automatic
        byte a= 123;
        short b ;
        b=a;

        //narrow type casting
        a = (byte) b;
        float f= 12412.234f;
        int i = 234;
        i = (int) f;
        System.out.println(i);
    }
}
