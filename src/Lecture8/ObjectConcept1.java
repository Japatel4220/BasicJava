package Lecture8;

import static Lecture8.ObjectConcept2.a;

public class ObjectConcept1 {
    int i = 20;
    int j = 30;

    public static void main(String[] args) {
        ObjectConcept1 oc = new ObjectConcept1();
        System.out.println(oc.i);
        System.out.println(oc.j);
        oc.j = 40;
        oc.flying();
        oc.drowning();

        System.out.println(a);
    }

        public void flying() {
            System.out.println("it is flying");
        }
        public void drowning() {
            System.out.println("it is drowning");
        }
    }


