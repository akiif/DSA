package OOP.Introduction;

/*
A class is a template for an object, and an object is an instance of a class.
A class creates a new data type that can be used to create objects.

When you declare an object of a class, you are creating an instance of that class.
Thus, a class is a logical construct. An object has physical reality. (That is, an object occupies space in memory.)
 */

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // store data of five students which includes the names and roll numbers
        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // the problem is that you want the above in a single data type
        // so here we can use classes


        Student[] students = new Student[5];

        Student akif = new Student();
        akif.rno = 1;
        akif.name = "Akif";
        akif.marks = 100.0f;

        System.out.println(akif);
        System.out.println(akif.rno + " " + akif.name + " " + akif.marks);
    }
}

// create a class
class Student {
    int rno;
    String name;
    float marks;
}
