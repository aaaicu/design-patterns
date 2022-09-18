package factorymethod.secondhandtrade;

import factorymethod.secondhandtrade.trader.Buyer;
import factorymethod.secondhandtrade.trader.CoolBuyer;
import factorymethod.secondhandtrade.trader.Trader;

public class BuyerFactory implements TraderFactory {
    @Override
    public Trader getTrader(boolean isCool, int hopePrice) {
        return isCool ? new CoolBuyer(hopePrice) : new Buyer(hopePrice);
    }
}
