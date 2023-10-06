package Lecture8;

public class Array {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        //...
        //..
        // change the value

        int z = 10;
        z++;
        System.out.println(z);

        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 85, 92, 98};
        //index       0   1   2   3   4   5   6   7   8   9   10  position

        arr[3] = 12;
        arr[3]++;
        System.out.println(arr[3]);

        arr[5] = arr[5] + arr[2];
        System.out.println(arr[5]);

        arr[10] = arr[1] * arr[2];
        System.out.println(arr[10]);

        for (int i=0; i<=10; i++){
            System.out.println(arr[i]);
        }


        System.out.println(arr.length); //length is used for array

        for (int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }


        String name = "Jahanvi";
        System.out.println(name.length()); //length is used for string

    }

}
