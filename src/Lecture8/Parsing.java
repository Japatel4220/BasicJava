package Lecture8;

public class Parsing {
    // parsing - primitive data type to non-primitive data type.
    //string -> int,float,double
    //       <-

    public static void main(String[] args) {
        String value ="10";
        int i = Integer.parseInt(value);
        System.out.println(i);
        i++;
        System.out.println(i);

        float f = Float.parseFloat(value);
        System.out.println(f);

        double d = Double.parseDouble(value);
        System.out.println(d);

        int j = 20;
        String value2 = String.valueOf(j);
        System.out.println("int is converted into String" + value2);
    }
}
