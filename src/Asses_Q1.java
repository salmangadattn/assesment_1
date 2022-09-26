public class Asses_Q1 {

    /*
        Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using
        static block, static method & static variable respectively.
     */

     static String firstName = "Mark";
     static String lastName = "Markel";
     static int age = 22;

    static {
        Asses_Q1.printName(firstName, lastName, age);
    }

     static void printName(String firstName, String lastName, int age){
        System.out.println("First Name is : "+ firstName);
        System.out.println("Last Name is : "+ lastName);
        System.out.println("Age is : "+ age);
    }

    public static void main(String[] args) {

    }
}
