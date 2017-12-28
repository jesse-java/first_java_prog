public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("     Hello    ", "       World      ");
        System.out.println(str); //HelloWorld


        // Get the index of the character and return either the index or null. If the character appears multiple times, return the first index.
        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator2.getIndexOrNull("Coding", letter);
        Integer b = manipulator2.getIndexOrNull("Hello World", letter);
        Integer c = manipulator2.getIndexOrNull("Hi", letter);

        System.out.println(a); //1
        System.out.println(b); //4
        System.out.println(c); //null

        //Get the index of the start of the substring and return either the index or null
        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer a2 = manipulator.getIndexOrNull(word, subString);
        Integer b2 = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(a2); //2
        System.out.println(b2); //null
        
        //Get a substring using a starting and ending index, and concatentate that 
        //with the second string input to our method
        StringManipulator manipulator4 = new StringManipulator();
        String word4 = manipulator4.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word4); //eworld 
    }
}