package ru.netology.qa;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackTest {
    private final CashBack service = new CashBack();

    @Test
    public void AmountIsLessThanTheLimit() {

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void AmountTheBorder() {

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}
