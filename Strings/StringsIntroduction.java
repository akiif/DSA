package Strings;

/*
Strings: Collection or sequence of characters
 */


import java.util.Arrays;

public class StringsIntroduction {

    public static void main(String[] args) {
        String name = "Akif"; // Here Akif is stored in the string pool in the heap.
        System.out.println(name);
        String name1 = "Akif";    //Has the same address as name and is referred to the above string pool

        System.out.println(name == name1); //checks if reference variable are pointing to same object

        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        //TODO:  We cannot change either of the references because of immutability so, if we want to modify
        // we will have to create a new string object and the reference variable point to the new object

        name = name.concat("aak"); // Here a new string object is created and the reference variable is pointed to it
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

        System.out.println("---------------------------------------------------\n");

        // TODO: To create different object of same values:-
        String a = new String("Akif");
        String b = new String("Akif");
        System.out.println(a == b);

        System.out.println("---------------------------------------------------\n");

        // TODO: To check only values use the .equals() operator.
        String a1 = new String("Akif");
        String b1 = new String("Akif");
        System.out.println(a.equals(b));

        System.out.println("---------------------------------------------------\n");

        System.out.println(new int[]{1, 2}); // It's using the Strings toString method.
        //TODO: Arrays.toString uses the string builder class to convert the array to a string and then print it as string.
        System.out.println(Arrays.toString(new int[]{1, 2})); // Here we are telling it to use Arrays toString method

        System.out.println("---------------------------------------------------\n");

        // TODO: Pretty Printing: Using Placeholders
        float x = 3.14555f;
        System.out.println(x);
        System.out.printf("The formatted number is: %.2f \n", x); //Use printf

        System.out.println(Math.PI);
        System.out.printf("pie is: %.3f \n", Math.PI);

        System.out.printf("I am %s and I am a %s \n", "Akif", "Dev");

        System.out.println("---------------------------------------------------\n");

        // TODO: Operators
        System.out.println('a' + 'b'); // It's adding the ASCII values
        System.out.println("a" + "b"); // It's doing string concatenation
        System.out.println('a' + 3);
        // Here 3 will be converted to Integer object and its .toString method will be called.
        System.out.println("a" + 3); // same as "a" + "3"

        System.out.println("---------------------------------------------------\n");

        // TODO: String Performance
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch;  // Here new string is being created in every loop
        }
        System.out.println(series);

        System.out.println("---------------------------------------------------\n");

        // TODO: StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.println(sb.toString());

        System.out.println("---------------------------------------------------\n");

        // TODO: String Methods
        String name3 = "Akif";
        System.out.println(Arrays.toString(name3.toCharArray()));
        System.out.println(name3.indexOf('i'));
        System.out.println(name3.toLowerCase());
        //System.out.println("     Akif    ".strip());
        String name4 = "Akif Mohammed";
        System.out.println(Arrays.toString(name4.split(" ")));

    }
}
