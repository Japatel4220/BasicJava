package Lecture9;

public class ConstructorTopic {
    //constructor is a method having same name as of class
    //it does not have return type
    //to call the constructor - we have to create an object and it is call automatically
    // type of constructor
    //   1. Pre defined (Default)
    //   2. User Defined
    //      2.1 Simple
    //      2.2 Parameterized
    ConstructorTopic() {
        System.out.println("This is an constructor");
    }
        ConstructorTopic(int i){
            System.out.println("The value of" + i);

    }
    public static void main(String[] args) {
        //call the method
        myBarking();
        ConstructorTopic constructorTopic = new ConstructorTopic(10); // object created
        constructorTopic.myBarking();

    }

    public static void myBarking(){
        System.out.println("Barking");

    }
}
