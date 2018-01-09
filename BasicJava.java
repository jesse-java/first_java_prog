import java.util.ArrayList;



public class BasicJava {


    // prints from numbers 1 to 255
    public void printNum () {
    
        for (int i = 0; i <= 255; i++) {
            System.out.println(i);
        }
        // String str = "Completed";
        // return str;
    }

    public void printOddNum() {
        for(int i = 1; i <= 255; i+=2) {
            System.out.println(i);
        }
    }

    public void printSum() {
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void getAverage(int[] arr ) {
        int total = 0;
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Average is: " + total/arr.length);
    }

    // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
    public ArrayList arrayWithOddNumbers() {
        // import java.util.ArrayList;
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for (int i = 1; i <= 255; i += 2) {
            myArray.add(i);
        }

        return myArray;

    }

    // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
    public int greaterThanY(int[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= y) {
                count++;
            }
        }
        return count;
    }

    // Square the values
    // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
    public int[] squareTheValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

    //     Eliminate Negative Numbers
    // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
    public void eliminateNegNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }

    //     Max, Min, and Average
    // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
    public int[] maxMinAvg(int[] arr) {
        int[] MMA;
        MMA = new int[3];

        
        int max = arr[0];
        int min = arr[0];
        int total = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

            total += arr[i];
        }

        MMA[0] = max;
        MMA[1] = min;
        MMA[2] = total/arr.length;

        return MMA;

    }

    // Shifting the Values in the Array
    // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
    public void shiftValuesOne(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = 0;
    }


}


