package mobi.merkureal.service;

public class CashbackService {
    public int calculate(int purchase) {
        int cashback = purchase * 5 / 100;
        return Math.min(cashback, 3_000);
    }
}
