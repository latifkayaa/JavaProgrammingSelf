package day36_Tasks.phoneTask;

public class Nokia extends Phone{

    public void selfDefense(){
        System.out.println(getClass().getSimpleName()+ " can be as a self defense tool.");
    }


}

/*
1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color
				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */