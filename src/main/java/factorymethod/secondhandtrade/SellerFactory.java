package factorymethod.secondhandtrade;

import factorymethod.secondhandtrade.trader.CoolSeller;
import factorymethod.secondhandtrade.trader.Seller;
import factorymethod.secondhandtrade.trader.Trader;

public class SellerFactory implements TraderFactory {
    @Override
    public Trader getTrader(boolean isCool, int hopePrice) {
        return isCool ? new CoolSeller(hopePrice) : new Seller(hopePrice);
    }

}
