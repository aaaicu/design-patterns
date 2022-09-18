package factorymethod.secondhandtrade;

import factorymethod.secondhandtrade.trader.Trader;

public interface TraderFactory {
    Trader getTrader(boolean isCool, int hopePrice);
}
