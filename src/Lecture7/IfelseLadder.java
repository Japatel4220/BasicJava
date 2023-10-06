package Lecture7;

public class IfelseLadder {
    public static void main(String[] args) {
        //100- 90 = A
        // 89- 80 = B
        // 79- 70 = c
        // 69- 60 = D
        // >60 = failed

        int marks = 100;
        if (marks <= 100 && marks >= 90) {
            System.out.println("you got A garde");
        } else if (marks <= 89 && marks >= 80) {
            System.out.println("you got B grade");
        } else if (marks <= 79 && marks >= 70) {
            System.out.println("you got C grade");
        } else if (marks <= 69 && marks >= 60) {
            System.out.println("you got D grade");
        } else
            System.out.println("you are failed");
    }
}