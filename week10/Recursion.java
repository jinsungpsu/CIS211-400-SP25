import java.util.Arrays;
import java.util.Random;

public class RecursionDemo {
    static int counter = 0;
    public static void main(String[] args) {
        Random rng = new Random();
        int[] arr = new int[500];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rng.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(arr[i] + " ");
        }
        //hi();

        //countdown(10);

        //countup(100, 500);

        System.out.println(search(17, arr)?"Found":"Not found");
    }

    static boolean search(int num, int[] arr) {
        // linear search
//        for (int i = 0; i < arr.length; i++ ) {
//            if (num == arr[i]) {
//                return true;
//            }
//        }
//        return false;

        // call binary search
        return binarySearch(num, 0, arr.length-1, arr);
    }

    static boolean binarySearch(int num, int low, int high, int[] arr) {
        int mid = low + ((high-low) / 2);
        if (num == arr[mid]) {
            return true;
        } else if (low > high) {
            // not found
            return false;
        }else if (num < arr[mid]) {
            // the item i'm looking is smaller than what's
            // in the middle or halfway through the array range
            // that i'm currently looking
            return binarySearch(num, low, mid-1, arr);
        } else {
            return binarySearch(num, mid+1, high, arr);
        }

    }

    static void countup(int low, int high) {
        countup(low, high, low);
    }

    static void countup(int low, int high, int count) {
        if (count % 15 == 0) System.out.println();
        System.out.print(count + " ");
        if(count == high) {
            return;
        }
        countup(low, high, count+1);
    }

    static void countdown(int num) {
        // need to do something...
        // to make the problem smaller...
        // also... need a base case...

        System.out.print(num + " ");

        // base case
        if (num == 0) {
            return;
        }
        countdown(num-1);

    }

    static void hi() {
        System.out.println(counter++);
        hi();
    }
}
