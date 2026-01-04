package ru.netology.qa;


import org.junit.Test;
import org.junit.Assert;

public class CashBackTest {
    private final CashBack service = new CashBack();

    @Test
    public void AmountIsLessThanTheLimit() {

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void AmountTheBorder() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

}
