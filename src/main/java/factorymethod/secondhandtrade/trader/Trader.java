package factorymethod.secondhandtrade.trader;

public interface Trader {
    default void trading() {
        print(tradeStart());
        print(requestTrade());
        print(tradeEnd());
    }

    private String tradeStart() {
        return "거래 시작";
    }
    private String tradeEnd() {
        return "거래 종료";
    }

    String requestTrade();

    private void print(String message) {
        System.out.println(message);
    }
}
