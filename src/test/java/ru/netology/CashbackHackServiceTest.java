package ru.netology;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testRemainBoundaryValuesOne() {
        org.junit.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }

    @org.junit.Test
    public void testRemainBoundaryValuesTwo() {
        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void testRemainBoundaryValuesThree() {
        org.junit.Assert.assertEquals(service.remain(1), 999);
    }

    @org.junit.Test
    public void testRemainBoundaryValuesFour() {
        org.junit.Assert.assertEquals(service.remain(999), 1);
    }

    @org.junit.Test
    public void testRemainBoundaryValuesFive() {
        org.junit.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.junit.Test
    public void testRemainBoundaryValuesSix() {
        org.junit.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.junit.Test
    public void testRemainCriticalPath() {
        org.junit.Assert.assertEquals(service.remain(400), 600);
    }
}
