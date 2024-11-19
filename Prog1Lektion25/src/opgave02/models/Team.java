package opgave02.models;

public class Team {
    private String name;
    private int points;
    private int goalsFor;
    private int goalsAgainst;

    public Team(String name, int points, int goalsFor, int goalsAgainst) {
        this.name = name;
        this.points = points;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public String getName() {
        return name;
    }

    public  int getPoints() {
        return points;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public  int getGoalDifference() {
        return goalsFor - goalsAgainst;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }
}
