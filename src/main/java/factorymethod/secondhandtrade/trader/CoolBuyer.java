package factorymethod.secondhandtrade.trader;

public class CoolBuyer extends DefaultTrader {

    public CoolBuyer(int hopePrice) {
        this.hopePrice = hopePrice;
    }

    @Override
    public void requestTrade() {
        System.out.println(this.hopePrice + "원으로 구매 제안합니다.");
    }
}
