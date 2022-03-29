public class Employee {

    private String firstName;
    private String lastName;

    Employee (String fn, String ln) {
        this.firstName = fn
        this.lastName = ln;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
