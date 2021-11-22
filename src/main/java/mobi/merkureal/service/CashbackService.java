package mobi.merkureal.service;

public class CashbackService {
    public int calculate(int purchase) {
        int cashback = purchase * 5 / 100;
        if (cashback > 3_000) {
            return 3_000;
        }
        return cashback;
    }
}
