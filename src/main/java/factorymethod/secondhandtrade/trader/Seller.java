package factorymethod.secondhandtrade.trader;

public class Seller extends DefaultTrader {
    public Seller(int hopePrice) {
        this.hopePrice = hopePrice;
    }

    @Override
    public void requestTrade() {
        System.out.println(this.hopePrice + "원으로 협의 시작합니다.");
    }
}
