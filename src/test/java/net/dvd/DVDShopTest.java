package net.dvd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class DVDShopTest {

    // checking if we have that dvd and how much it costs
    ArrayList dvdList = new ArrayList<DVD>();

    PaymentGateway paymentGateway = mock(PaymentGateway.class);


    @BeforeEach
    void setupData() {
        dvdList.add(new DVD("Ghost busters", 79.95, 7));
        dvdList.add(new DVD("Mamma Jack", 59.95, 5));
        // when(paymentGateway.pay("Andre", 0.00)));
    }

    @Test
    public void shouldBeAbleToCheckIfTheShopHasTheDVD() {


        DVDShop shop = new DVDShop(paymentGateway, dvdList);
        DVD dvd = shop.check("Ghost busters");
        Assertions.assertEquals(79.95, dvd.getPrice());

    }

    @Test
    public void shouldBeAbleToCheckIfTheShopHasMammaJackAndHowMuchItCosts() {

        DVDShop shop = new DVDShop(paymentGateway, dvdList);
        DVD dvd = shop.check("Mamma Jack");
        Assertions.assertEquals(59.95, dvd.getPrice());

        // Assertions.assertEquals('29.99', shop.check("Bambie"));

    }

    // check if a DVD is in stock

    @Test
    public void shouldBeAbleToCheckIfMammaJackIsInStock() {


        DVDShop shop = new DVDShop(paymentGateway, dvdList);
        DVD dvd = shop.check("Mamma Jack");
        Assertions.assertEquals(5, dvd.stockLevel());

    }

    @Test
    public void shouldBeAbleToBuyDVDs() {

        DVDShop shop = new DVDShop(paymentGateway, dvdList);
        // shop.createBasket("andre");
        shop.buy("Andre", "Mamma Jack");
        DVD dvd = shop.check("Mamma Jack");

        Assertions.assertEquals(4, dvd.stockLevel());
        verify(paymentGateway).pay("Andre", 59.95);
    }

    @Test
    public void shouldNotBeAbleToBuyMoreDVDsThanTheNumberInStock() {

        DVDShop shop = new DVDShop(paymentGateway, dvdList);
        shop.buy("Andre", "Mamma Jack");
        shop.buy("Andre","Mamma Jack");
        shop.buy("Andre","Mamma Jack");
        shop.buy("Andre","Mamma Jack");
        shop.buy("Andre","Mamma Jack");
        //
        shop.buy("Andre","Mamma Jack");

        DVD dvd = shop.check("Mamma Jack");
        Assertions.assertEquals(0, dvd.stockLevel());
    }


    //



}
