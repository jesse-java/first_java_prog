import java.util.ArrayList;


public class BasicJavaTest {

    public static void main(String[] args) {
        BasicJava bj = new BasicJava();

        bj.printNum();

        bj.printOddNum();

        bj.printSum();

        int[] myArray = {4,8,8,5,9};
        bj.getAverage(myArray);


        ArrayList myArray2 = bj.arrayWithOddNumbers();
        System.out.println("This is an array with odd numbers: " + myArray2);


        int[] myArray3 = {4,8,8,1,-10};
        int count = bj.greaterThanY(myArray3, 3);
        System.out.println("There are " + count + " values in the array that are greater than 3");
       

        int[] myArray4 = {1,5,10,-2};
        int[] newArray = bj.squareTheValues(myArray4);
        //java.util.Arrays.toString() is used to print the data in the array
        //as opposed to calling the default method "toString()" to display the object's class name
        //representation then "@" followed by its hashCode 
        System.out.println("New squared values : " + java.util.Arrays.toString(newArray)); 

        int[] myArray5 = {1,3,-10,1,0,-9};
        bj.eliminateNegNums(myArray5);
        System.out.println("New array with no negs: " + java.util.Arrays.toString(myArray5));

        int[] myArray6 = {1,-19,8483,0,23,860,-9999};
        int[] newArray2 = bj.maxMinAvg(myArray6);
        System.out.println("myArray6 has maximum: " + newArray2[0] + ", minimum: " + newArray2[1] + ", and average: " + newArray2[2]);

        int[] myArray7 = {1,5,10,7,-2};
        bj.shiftValuesOne(myArray7);
        System.out.println("myArray7 was shifted by one: " + java.util.Arrays.toString(myArray7));
    }


}
