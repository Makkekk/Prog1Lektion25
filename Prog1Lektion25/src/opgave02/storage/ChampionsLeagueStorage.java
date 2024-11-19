package opgave02.storage;

import opgave01.models.Character;
import opgave02.models.Team;

import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.util.ArrayList;

public class ChampionsLeagueStorage {
    private Team[] groupA = {
            new Team("Bayern München", 13, 11, 6),
            new Team("FC København", 5, 7, 8),
            new Team("Galatasaray", 5, 10, 12),
            new Team("Manchester United", 4, 12, 14)
    };
    private Team[] groupB = {
            new Team("Arsenal", 13, 11, 6),
            new Team("PSV Eindhoven", 8, 7, 9),
            new Team("Lens", 5, 4, 10),
            new Team("Sevilla", 2, 6, 10)
    };

    public Team[] getGroupA() {
        return groupA;
    }

    public Team[] getGroupB() {
        return groupB;
    }

    public static ArrayList<Team> flet(Team[] groupA, Team[] groupB) {
        int index1 = 0;
        int index2 = 0;
        ArrayList<Team> result = new ArrayList<>();

        while (index1 < groupA.length && index2 < groupB.length) {
            Team teamA = groupA[index1];
            Team teamB = groupB[index2];

            if (teamA.getPoints() > (teamB.getPoints())) {
                result.add(teamA);
                index1++;

            } else if (teamA.getPoints() < teamB.getPoints()) {
                result.add(teamB);
                index2++;
            } else {
                if (teamA.getGoalDifference() > teamB.getGoalDifference()) {
                    result.add(teamA);
                    index1++;
                } else {
                    result.add(teamB);
                    index2++;
                }
            }
            while (index1 < groupA.length) {
                result.add(groupA[index1]);
                index1++;
            }
        }
        while (index2 < groupB.length) {
            result.add(groupB[index2]);
            index2++;
        }
        return result;
    }

}
