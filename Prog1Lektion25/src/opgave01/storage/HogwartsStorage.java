package opgave01.storage;

import opgave01.models.Character;
import opgave01.models.House;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class HogwartsStorage {
    private ArrayList<Character> characters = new ArrayList<>();

    public HogwartsStorage() {
        this.characters = characters;
        Gson gson = new GsonBuilder().create();
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://hp-api.onrender.com/api/characters/students"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            characters = gson.fromJson(response.body(), new TypeToken<List<Character>>() {
            }.getType());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Character> getHouseGryffindor() {
        return new ArrayList<Character>(characters
                .stream()
                .filter(c -> c.getHouse() == House.GRYFFINDOR)
                .sorted()
                .toList()
        );
    }

    public ArrayList<Character> getHouseSlytherin() {
        return new ArrayList<Character>(characters
                .stream()
                .filter(c -> c.getHouse() == House.SLYTHERIN)
                .sorted()
                .toList()
        );
    }

    public static ArrayList<Character> flet(ArrayList<Character> gryffindors, ArrayList<Character> slytherins) {
        ArrayList<Character> result = new ArrayList<Character>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < gryffindors.size() && index2 < slytherins.size()) {
            if (gryffindors.get(index1).compareTo((slytherins.get(index2))) <= 0) {
                result.add(gryffindors.get(index1));
                index1++;
            } else {
                result.add(slytherins.get(index2));
                index2++;
            }
        }
        while (index1 < gryffindors.size()) {
            result.add(gryffindors.get(index1));
            index1++;
        }
        while (index2 < slytherins.size()) {
            result.add(slytherins.get(index2));
            index2++;
        }
        return result;
    }

}