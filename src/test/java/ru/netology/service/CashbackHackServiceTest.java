package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }
    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}