package day36_Tasks.sportsTask;

public class Basketball extends Sport{


    public Basketball(String rules, int numberOfPlayers, int numberOfReferee) {
        super(rules, numberOfPlayers, numberOfReferee);
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}
