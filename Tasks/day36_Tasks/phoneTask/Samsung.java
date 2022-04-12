package day36_Tasks.phoneTask;

public class Samsung extends Phone {

    public void freeze() {
        System.out.println(getClass().getSimpleName() + " is freezing.");
    }


}

/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */