package net.dvd;

import java.util.List;

public class DVDShop {

    private final PaymentGateway paymentGateway;
    private List<DVD> dvdList;


    public DVDShop(PaymentGateway paymentGateway, List<DVD> dvdList) {
        this.dvdList = dvdList;
        this.paymentGateway = paymentGateway;
    }

    public DVD check(String dvdName) {
        DVD currentDVD = null;
        for(DVD dvd : dvdList) {
            if (dvd.getTitle() == dvdName){
                currentDVD = dvd;
                break;
            }
        }
        return currentDVD;
    }

    public void buy(String customer, String dvdName) {
        DVD currentDVD;
        for(DVD dvd : dvdList) {
            if (dvd.getTitle() == dvdName){
                dvd.sell(1);
                currentDVD = dvd;
                this.paymentGateway.pay(customer, currentDVD.getPrice());
                break;
            }
        }
    }
}
