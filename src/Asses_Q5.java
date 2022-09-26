public class Asses_Q5 {

         /*
            Q5) Create a class named Employee with fields firstname,lastname,age and designation.
                The class should:

            *   have all types of constructors to initialize the object
            *   class should also have setter methods to update a particular field
            *   Override its toString method to display a meaningful message using all these fields.
         */

    public static void main(String args[]){


        Employee emp1 = new Employee();

        Employee emp2 = new Employee("Raj","Gupta", 24, "SDET");

        emp1.setFirstName("Salman");
        emp1.setLastName("Gada");
        emp1.setAge(23);
        emp1.setDesignation("SET");

        System.out.println(emp1);
        System.out.println(emp2);

    }


}
