package Lecture8;

public class IntArray {
    public static void main(String[] args) {

        int numbers[]= {10,20,30,40,50,60,70,80,90};
        numbers[5]= 100;
        System.out.println(numbers[5]);
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
