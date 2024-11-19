package opgave04.models;

public class Person implements Comparable<Person> {
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int compareTo(Person other) {
        return 0;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}
