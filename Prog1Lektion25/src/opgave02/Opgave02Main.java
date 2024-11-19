package opgave02;

import opgave02.models.Team;
import opgave02.storage.ChampionsLeagueStorage;

import java.util.ArrayList;

public class Opgave02Main {
    public static void main(String[] args) {
        ChampionsLeagueStorage storage = new ChampionsLeagueStorage();
        Team[] groupA = storage.getGroupA();
        Team[] groupB = storage.getGroupB();

        ArrayList<Team> mergedteams = ChampionsLeagueStorage.flet(storage.getGroupA(), storage.getGroupB());

        System.out.println();
        for (Team team : mergedteams);
        System.out.println(Team.getName + " - Points: " + Team.getPoints() + ", Goal Difference: " + Team.getGoalDifference());
    }
}
