package certification;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    Person(String fName, String LName, int age) {
        this.firstName = fName;
        this.lastName = LName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }


    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
