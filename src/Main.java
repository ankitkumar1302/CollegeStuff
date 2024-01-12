
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        int[] arr = {5, 55, 774, 55, 89, 789};

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max + " is the max value");
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min + " is the min value");

        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg + " is the average value");
         */

        /*
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = Arrays.stream(arr).filter(num -> num % 2 == 0).toArray();
        System.out.println(Arrays.toString(arr2));


         */
        /*
        String[] strArray = {"java", "test", "kite", "hello", "flip", "lion"};
        Object[] aa = Arrays.stream(strArray)
                .filter(str -> str.startsWith("java")).toArray();
        System.out.println(Arrays.toString(aa)
        );
         */

        int[] arr = {22, 55, 66, 44, 88, 77};
        int[] arr2 = Arrays.stream(arr).map(num -> num * 10).toArray();
        System.out.println(Arrays.toString(arr2));


    }
}