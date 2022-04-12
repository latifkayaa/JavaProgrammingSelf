package day24_Method_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initialsOfAName("Latif");
        findDomain("latif.kayaa@gmail.com");
        findMonth(8);
        findDay(7);
    }

    public static void initialsOfAName(String name){

        String initial= name.substring(0,1);
        System.out.println("Name "+ initial+"....");

    }

    public static void findDomain (String email){
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("Domain of the email is:"+ domain);

    }

    public static void findMonth (int number){
        String name = "";

        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }

    public static void findDay (int number){
        String name = "";

        if(number >= 1 && number <= 7){

            name = (number==1)?"Monday" :(number==2)?"Tuesday" :(number==3)?"Wednesday" :(number==4)?"Thursday" :(number==5)?"Friday"
                    :(number==6)?"Saturday" : "Sunday";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);
    }


}
