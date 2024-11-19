package opgave04;

import opgave04.models.Person;
import opgave04.testdata.TestDataGenerator;

import javax.swing.*;
import java.util.ArrayList;

public class Opgave04Main {

    public static void main(String[] args) {
        ArrayList<Person> people1 = TestDataGenerator.generatePeople();
        System.out.println(people1);
        ArrayList<Person> people2 = TestDataGenerator.generatePeople();
        System.out.println(people2);
    }

    public ArrayList<Person> merge(ArrayList<Person> people1, ArrayList<Person> people2) {
        return null;
        //Implementer denne metode
    }
}
