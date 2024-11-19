package opgave01;

import opgave01.models.Character;
import opgave01.storage.HogwartsStorage;

import java.util.ArrayList;

import static opgave01.storage.HogwartsStorage.flet;

public class Opgave01Main {
    public static void main(String[] args) {
        HogwartsStorage storage = new HogwartsStorage();
        ArrayList<Character> gryffindors = storage.getHouseGryffindor();
        ArrayList<Character> slytherins = storage.getHouseSlytherin();

        ArrayList<Character> allStudents = flet(gryffindors,slytherins);
        for (Character allstudent : allStudents) {
            System.out.println(allstudent);

        }
     }

}
