package mobi.merkureal.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void shouldCashbackCalculateUnderLimit() {
        CashbackService service = new CashbackService();
        int purchase = 10_000;

        int result = service.calculate(purchase);

        assertEquals(500, result);
    }
    @Test
    void shouldCashbackCalculateOverLimit() {
        CashbackService service = new CashbackService();
        int purchase = 1_000_000;

        int result = service.calculate(purchase);

        assertEquals(3_000, result);
    }
}