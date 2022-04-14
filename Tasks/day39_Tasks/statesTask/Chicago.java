package day39_Tasks.statesTask;

public class Chicago extends States{

    public Chicago(String politicalParty, String governor, String senator, int population, double stateTax) {
        super("Chicago", "IL", politicalParty, governor, senator, population, stateTax);
    }

    public void windy(){
        System.out.println(getClass().getSimpleName()+ " is an windy city.");
    }

}
