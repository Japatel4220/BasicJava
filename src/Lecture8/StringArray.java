package Lecture8;

public class StringArray {
    public static void main(String[] args) {
        String names[]={"Jahanvi","Brita","Sheetal","Hardik","Nirav"};
        names[3]="Deep";

        for (String name:names){
            System.out.println(name);
            System.out.println(names.length);
        }
    }
}
