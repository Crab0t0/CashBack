package ru.netology.qa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashBackTest {
    private final CashBack service = new CashBack();

    @Test
    public void AmountIsLessThanTheLimit() {

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void AmountTheBorder() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

}
