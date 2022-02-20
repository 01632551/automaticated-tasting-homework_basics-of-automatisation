package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private final CashbackHackService service = new CashbackHackService();
    @org.testng.annotations.Test
    public void shouldCalculateWithAmountAsBoundary() {
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWithAmountBelowBoundary() {
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWithAmount0() {
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWithAmountUnderBoundary() {
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWithAmountInMiddleAreaOfBoundary() {
        int amount = 599;

        int expected = 401;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}