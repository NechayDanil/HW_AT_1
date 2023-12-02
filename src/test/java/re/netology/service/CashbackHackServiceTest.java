package re.netology.service;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainBelowBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainAboveBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWihCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 901;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
}

