package Lecture6;

public class PredefinedMethods {
    public static void main(String[] args) {
     String name = "jahanvi";
     String lastname = "patel";
     String fullname = name+lastname;
     String firstsection = "women";
        System.out.println(name);
        System.out.println(lastname);

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(lastname));
        System.out.println(name.equals("jahanvi"));
        System.out.println(name + lastname);
        System.out.println(firstsection.equals("women"));
        System.out.println(name.length());
        System.out.println(lastname.length());
        System.out.println(name.isEmpty());
        System.out.println(name.replace('i', 'o'));
        System.out.println(fullname.toLowerCase());
        System.out.println(fullname.toUpperCase());



    }
}
