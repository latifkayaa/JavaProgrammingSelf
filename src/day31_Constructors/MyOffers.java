package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 90000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("---------------------------------------------------");

        Offer[] offers = {offer1, offer2, offer3, offer4, offer5};
        //Full time
        ArrayList<Offer> fullTimes= new ArrayList<>(Arrays.asList(offers));
        fullTimes.removeIf(p-> p.isFullTime == false);
        System.out.println("Full time offers are: "+ fullTimes);

        System.out.println();
        //Local Offers, remove not local ones. I'm from WA
        ArrayList<Offer> localOffers= new ArrayList<>(Arrays.asList(offers));
        localOffers.removeIf(p-> !p.location.equals("WA"));
        System.out.println("Local offers are: "+ localOffers);

        System.out.println();
        //Offers are with benefits. Remove all doesnt have benefits and dont have PTO

        ArrayList<Offer> withBenefits= new ArrayList<>(Arrays.asList(offers));
        withBenefits.removeIf(p-> p.hasBenefit==false || p.hasPTO==false);
        System.out.println("Offers with benefits and PTO: "+ withBenefits);

        //sDet Offers
        ArrayList<Offer> sdetOffers= new ArrayList<>(Arrays.asList(offers));
        sdetOffers.removeIf(p-> !p.jobTitle.equalsIgnoreCase("sdet"));
        System.out.println("Sdet job title offers are: "+ sdetOffers);

        System.out.println();
        System.out.println();
        ArrayList<Offer> offersWith100K= new ArrayList<>(Arrays.asList(offers));
        offersWith100K.removeIf(p-> p.salary<100000);
        System.out.println("Offers over 100K: "+ offersWith100K);



    }
}
