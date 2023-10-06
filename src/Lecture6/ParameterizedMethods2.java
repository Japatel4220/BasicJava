package Lecture6;

import javax.naming.Name;

public class ParameterizedMethods2 {
    public static void main(String[] args) {
      employeeId(101);
      employeeName("jahanvi");

    }

    public static void employeeId (int a){
        System.out.println("this employeeId is " +a);
    }
    public static void employeeName (String name){
        System.out.println("this employeeName is " + name);
    }
}
