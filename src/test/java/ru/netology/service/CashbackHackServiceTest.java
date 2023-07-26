package ru.netology.service;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test

    public void BuyZeroCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals (expected, actual);
        System.out.println(service.remain(amount));
    }

    @org.junit.Test

    public void SimpleBuyCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
        System.out.println(service.remain(amount));
    }


    @org.junit.Test

    public void EqualsBoundaryCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
        System.out.println(service.remain(amount));

    }

}
