package factorymethod.secondhandtrade.trader;

public class Buyer extends DefaultTrader {

    public Buyer(int hopePrice) {
        this.hopePrice = hopePrice;
    }

    @Override
    public String requestTrade() {
        return printRequestMessage();
    }

    public String printRequestMessage() {
        return this.hopePrice + "원으로 구매 협의 시작합니다.";
    }
}
