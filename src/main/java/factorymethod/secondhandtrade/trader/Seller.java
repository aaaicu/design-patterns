package factorymethod.secondhandtrade.trader;

public class Seller extends DefaultTrader {
    public Seller(int hopePrice) {
        this.hopePrice = hopePrice;
    }

    @Override
    public String requestTrade() {
        return printRequestMessage();
    }

    public String printRequestMessage() {
        return this.hopePrice + "원으로 판매 협의 시작합니다.";
    }
}
