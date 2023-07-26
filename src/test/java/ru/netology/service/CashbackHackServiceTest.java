package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void BuyZeroCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
        System.out.println(service.remain(amount));
    }

    @org.testng.annotations.Test
    public void SimpleBuyCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
        System.out.println(service.remain(amount));
    }


    @org.testng.annotations.Test
    public void EqualsBoundaryCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
        System.out.println(service.remain(amount));

    }

}
