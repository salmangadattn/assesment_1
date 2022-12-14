public class Employee {

    private String firstName;

    private String lastName;

    private int age;

    private String designation;

    public Employee(){
        this.firstName = "sal";
        this.lastName = "man";
        this.age = 22;
        this.designation = "intern";
    }

    public Employee(String firstName,
                    String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Employee(String firstName,
                    String lastName,
                    int age,
                    String designation){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.designation=designation;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String toString(){
        return "This is the details of "+firstName+" "+lastName+" aged "+age+". He works as " +
                designation+" at TTH";
    }
}
