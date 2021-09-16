public class StringExamples {

    public static void main(String[] args) {

        String greeting = "Hello";
        String name = "Hephaestus";


        //Style1
        int greetingSize = greeting.length();
        System.out.println(greeting +" has "  + greetingSize + " letters");

        //Style 2
        System.out.println(name + " has " + name.length() + "letters. ");

        //Create a program which capitalizes the first letter of any word.

        /*
        1. Get the input - users name
        2. Isolate the first letter
        3. Capitalize the first letter
        4. Combine everything AFTER the first letter
        5. Combine #2 and #4
        6. Output
         */

        System.out.println(capitalizeFirst(name));

    }

    public static String capitalizeFirst(String name){

        String firstLetter = name.substring(0, 1);

        firstLetter = firstLetter.toUpperCase();

        String restOfName = name.substring(1);

        return firstLetter + restOfName;


    }

}
