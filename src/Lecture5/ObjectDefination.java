package Lecture5;

public class ObjectDefination {

    //if you want to use any state(variable)/behaviour(method) inside main method
    //static-- we don't need to create an object
    //non static-- we have to create an object

     static int a = 10;  //state
    int b = 20;


    public static void main(String[] args) {
        ObjectDefination ob = new ObjectDefination();
        // classname    objectname = New classname();

        ob.a = 27;
        System.out.println(ob.a);
       // system.out.println(a);
        System.out.println(ob.b);
        System.out.println(a); // it won't work without object
        System.out.println(a); // it will work because you've used static in front.

    }


    public void red(){
        // behaviour
    }
}
