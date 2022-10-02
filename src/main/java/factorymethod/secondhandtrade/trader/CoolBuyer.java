package factorymethod.secondhandtrade.trader;

public class CoolBuyer extends DefaultTrader {

    public CoolBuyer(int hopePrice) {
        this.hopePrice = hopePrice;
    }

    @Override
    public String requestTrade() {
        return printRequestMessage();
    }

    public String printRequestMessage() {

        return this.hopePrice + "원으로 쿨하게 구매 제안합니다.";
    }
}
