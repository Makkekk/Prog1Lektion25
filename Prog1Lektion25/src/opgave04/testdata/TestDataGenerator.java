package opgave04.testdata;

import com.github.javafaker.Faker;
import opgave04.models.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Collectors;

public class TestDataGenerator {

    public static ArrayList<Person> generatePeople() {
        Faker faker = new Faker(new Locale("da-DK"));
        ArrayList<Person> people = new ArrayList<>();
        for (int index = 0; index < 20; index++) {
            people.add(new Person(faker.name().firstName(), faker.name().lastName()));
        }
        people = new ArrayList<>(people.stream().sorted(new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                if (person1.getLastname().compareTo(person2.getLastname()) != 0) {
                    return person1.getLastname().compareTo(person2.getLastname());
                }
                return person1.getFirstname().compareTo(person2.getFirstname());
            }
        }).toList());
        return people;
    }
}
