import java.util.ArrayList;


class ExceptionEx {


    public static void main(String[] args) {
       ArrayList<Object> myList = new ArrayList<Object>();
       myList.add("13");
       myList.add("Hello  World");
       myList.add(48);
       myList.add("Goodbye World"); 

       System.out.println(myList);

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            } catch (ClassCastException e) {
                System.out.println("Didn't work");
            }
        }

        System.out.println(myList);



        ArrayList<Object> myList2 = new ArrayList<Object>();
        myList2.add("13");
        myList2.add("Hello World");
        myList2.add(48);
        myList2.add("Goodbye World");

        

        // for (int i = 0; i < myList2.size(); i++) {
        //     // try {
        //         // Integer castedValue = myList.get(i);
        //     // } catch (ClassCastException e) {
        //         // System.out.println("Didn't work");
        //     // }
        // }

        System.out.println(myList2);

    }    


 

}   