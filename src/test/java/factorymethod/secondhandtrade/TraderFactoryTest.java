package factorymethod.secondhandtrade;

import factorymethod.secondhandtrade.trader.Trader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class TraderFactoryTest {
    @Test()
    @DisplayName("구매자")
    void makeBuyerObject() {
        BuyerFactory buyerFactory = new BuyerFactory();
        Trader trader = buyerFactory.getTrader(false, 2000);
        trader.trading();
    }

    @Test()
    @DisplayName("판매자")
    void makeSellerObject() {
        SellerFactory sellerFactory = new SellerFactory();
        Trader trader = sellerFactory.getTrader(true, 2000);
        trader.trading();
    }
}