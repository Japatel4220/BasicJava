package Lecture7;

public class SwitchCase {
    public static void main(String[] args) {
        //1= Monday
        //2= Tuesday
        //3= Wednesday
        //4= Thursday

        int a = 1;

        switch (a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            default:
                System.out.println("your value doesn't match with condition");
        }

    }
}
