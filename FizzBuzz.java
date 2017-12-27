public class FizzBuzz {
    public String fizzBuzz(int number) {
        //fizzbuzz logic here

        if ( Math.IEEEremainder(number, 3)  == 0 && Math.IEEEremainder(number, 5) == 0 ) {
            return "FizzBuzz"; 
        } else if (Math.IEEEremainder(number, 3) == 0 ) {
            return "Fizz";
        } else if ( Math.IEEEremainder(number, 5) == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}