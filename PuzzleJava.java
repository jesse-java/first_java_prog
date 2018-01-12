import java.util.*;
// import java.util.ArrayList;
// import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class PuzzleJava {
    public static void main(String[] args) {
          

        // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)

        int[] myArray = {3,5,1,2,7,9,8,13,25,32};
        ArrayList myArrayR = printSumAndGt10(myArray);
        System.out.println(myArrayR);

        
        // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
        
        String[] myArray2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList myArray2R = shuffleArrAndGt5(myArray2);
        System.out.println(myArray2R);
        
        // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        shuffleAlphabet(alphabet);

        // Generate and return an array with 10 random numbers between 55-100.
        int[] randoms = genRandoms();
        System.out.println(java.util.Arrays.toString(randoms));

        // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
        int[] sortedrandoms = genSortedRandoms();
        System.out.println(java.util.Arrays.toString(sortedrandoms));
        System.out.println(sortedrandoms[0]);
        System.out.println(sortedrandoms[sortedrandoms.length-1]);

        // Create a random string that is 5 characters long.
        String randStr = genRandomStr();
        System.out.println(randStr);


        // ● Generate an array with 10 random strings that are each 5 characters long
        String[] randArrStr = genRandomArrStr();
        System.out.println(java.util.Arrays.toString(randArrStr));
    }
    

    static ArrayList printSumAndGt10(int[] arr) {
        int sum = 0;
        ArrayList<Integer> gt10Arr = new
        ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (arr[i] > 10) {
                gt10Arr.add(arr[i]);
            }

        }
        System.out.println(sum);
        return gt10Arr;
    }

    static ArrayList shuffleArrAndGt5(String[] arr) {
        strShuffleArray(arr);
        ArrayList<String> returnArr = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

            if(arr[i].length() > 5) {
                returnArr.add(arr[i]);
            }
        }

        return returnArr;

        
    }

    static void shuffleAlphabet(char[] arr) {
        charShuffleArray(arr);
        System.out.println(arr);
        System.out.println("Last char of the array is: " + arr[arr.length-1]);
        

        char[] vowels = {'a','e','i','o','u'};
        for (int i = 0; i < vowels.length; i++) {
            if (arr[0] == vowels[i]) {
                System.out.println("First char of the array is a vowel!");
                return;                
            };
        }


        System.out.println("First char of the array is: " + arr[0]);
    }


    static int[] genRandoms() {

        int[] randoms;
        randoms = new int[10];

        for(int i = 0; i < 10; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(50,100 + 1);
            randoms[i] = randomNum;
        }

        return randoms;
        
    }

    static int[] genSortedRandoms() {
        int[] sortRandoms;
        sortRandoms = new int[10];

        for(int i = 0; i < 10; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(50,100+1);
            sortRandoms[i] = randomNum;
        }        
        Arrays.sort(sortRandoms);
        return sortRandoms;
    }

    static String genRandomStr() {

        String CHARS = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder strChars = new StringBuilder();
        Random rnd = new Random();
        while(strChars.length() < 5) {
            int index = (int) (rnd.nextFloat() * CHARS.length());
            strChars.append(CHARS.charAt(index));
        }
        String str = strChars.toString();
        return str;
        
    }

    static String[] genRandomArrStr() {

        String[] arrStr;
        arrStr = new String[10];

        for (int index = 0; index < 10; index++) {
            arrStr[index] = genRandomStr();
        }

        return arrStr;

    }

    //HELPER FUNCTIONS
    // Fisher-Yates Shuffle
    static void intShuffleArray(int[] arr) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i+1);
            //Simple swap
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }

    static void strShuffleArray(String[] arr) {
        Random rnd = ThreadLocalRandom.current();
        for(int i = arr.length -1; i > 0; i--) {
            int index = rnd.nextInt(i+1);
            String a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }

    static void charShuffleArray(char[] arr) {
        Random rnd = ThreadLocalRandom.current();
        for(int i = arr.length -1; i > 0; i--) {
            int index = rnd.nextInt(i+1);
            char a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }


   
}