package day36_Tasks.sportsTask;

public class Sport {

   public String name, rules;
   public int numberOfPlayers, numberOfReferee;

    public Sport( String rules, int numberOfPlayers, int numberOfReferee) {
        name = getClass().getSimpleName();
        this.rules = rules;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
    }

    public void play(){
        System.out.println(name + " is playing "+ getClass().getSimpleName());
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
