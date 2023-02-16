public class Person {
    private String firstName, lastName;
    private int age;

    public Person() {}

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return String.format("Person{firstName:%s, lastName:%s, age:%d}", getFirstName(), getLastName(), getAge());
    }

    public static void main(String[] args) {
        Person john = new Person("JOHN", "DoE", 20);
        System.out.println(john);
    }
}
