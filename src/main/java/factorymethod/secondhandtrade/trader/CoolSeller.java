package factorymethod.secondhandtrade.trader;

public class CoolSeller extends DefaultTrader{
    public CoolSeller(int hopePrice) {
        this.hopePrice = hopePrice;
    }

    @Override
    public String requestTrade() {
        return printRequestMessage();
    }

    public String printRequestMessage() {
        return this.hopePrice + "원으로 쿨하게 판매 제안합니다.";
    }
}
