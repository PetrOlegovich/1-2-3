
public class Person {
    private String firstName;
    private int age;

    public Person(String firstName, int age){
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(" %s, %d ", firstName, age);

    }

    public Object getFirstName() {
    }
}
