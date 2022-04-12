package day31_Tasks.resturantTask;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1= new Restaurant("Latif", "Seattle", 2);
        //Make an array of servers
        Server [] servers = {
                new Server("Yasin", 29, 15, false),
                new Server("Sabryne", 28, 10, false),
                new Server("Karim", 27, 12, false),
                new Server("Aysel", 26, 20, true),
                new Server("Kamal", 25, 23, true),
        };

        Chef [] chefs = {
                new Chef("Ali", 10, 35, true),
                new Chef("Coşkun", 11, 36, false),
                new Chef("Omer", 12, 39, true)
        };


        restaurant1.hireServer(servers);
        restaurant1.hireChef(chefs);

        System.out.println(restaurant1);




    }
}
