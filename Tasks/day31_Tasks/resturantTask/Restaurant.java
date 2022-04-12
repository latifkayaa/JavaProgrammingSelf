package day31_Tasks.resturantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs= new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }
    //Overloading

    public void hireServer(Server [] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChefs(Chef chef){
        chefs.add(chef);
    }
    //Overloading

    public void hireChef(Chef [] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void  terminateChef(int employeeID){
        chefs.removeIf(p-> p.employeeID==employeeID);
    }

    public void  terminateServer(int employeeID){
        servers.removeIf(p-> p.employeeID==employeeID);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }
}
