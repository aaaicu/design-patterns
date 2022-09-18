package factorymethod.secondhandtrade.trader;

public class CoolSeller extends DefaultTrader{
    public CoolSeller(int hopePrice) {
        this.hopePrice = hopePrice;
    }

    @Override
    public void requestTrade() {
        System.out.println(this.hopePrice + "원으로 판매 제안합니다.");
    }
}
