public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        //the hypotenuse is the side across the right angle.
        // calculate the value of c given legA and legB
        //run some calculations
        double total = Math.pow(legA, 2) + Math.pow(legB, 2);
        double squareRoot = Math.sqrt(total);
        return squareRoot;
    }
}
