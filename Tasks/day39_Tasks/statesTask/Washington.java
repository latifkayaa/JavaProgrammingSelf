package day39_Tasks.statesTask;

public class Washington extends States{

    public Washington( String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super("Washington", "WA", politicalParty, governor, senator, population, stateTax);
    }

    public void lake(){
        System.out.println(getClass().getSimpleName()+ " has an thousands of lakes.");
    }

}
