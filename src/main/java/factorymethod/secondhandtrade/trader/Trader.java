package factorymethod.secondhandtrade.trader;

public interface Trader {
    default void trading() {
        printStart();
        requestTrade();
    }

    private void printStart() {
        System.out.println("거래 시작");
    }

    void requestTrade();
}
