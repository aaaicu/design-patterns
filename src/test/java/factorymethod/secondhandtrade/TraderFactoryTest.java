package factorymethod.secondhandtrade;

import factorymethod.secondhandtrade.trader.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class TraderFactoryTest {
    BuyerFactory buyerFactory;
    SellerFactory sellerFactory;

    @BeforeEach
    void before() {
        buyerFactory = new BuyerFactory();
        sellerFactory = new SellerFactory();   }

    @Test()
    @DisplayName("구매자")
    void makeBuyerObject() {
        int hopePrice = 2000;
        Trader trader = buyerFactory.getTrader(false, hopePrice);
        trader.trading();

        assertThat(trader).isOfAnyClassIn(Buyer.class);
        assertThat(trader.requestTrade()).isEqualTo(hopePrice + "원으로 구매 협의 시작합니다.");
    }

    @Test()
    @DisplayName("판매자")
    void makeSellerObject() {

        int hopePrice = 2000;
        Trader trader = sellerFactory.getTrader(false, hopePrice);
        trader.trading();

        assertThat(trader).isOfAnyClassIn(Seller.class);
        assertThat(trader.requestTrade()).isEqualTo(hopePrice + "원으로 판매 협의 시작합니다.");
    }

    @Test()
    @DisplayName("쿨 구매자")
    void makeCoolBuyerObject() {

        int hopePrice = 2000;
        Trader trader = buyerFactory.getTrader(true, hopePrice);
        trader.trading();

        assertThat(trader).isOfAnyClassIn(CoolBuyer.class);
        assertThat(trader.requestTrade()).isEqualTo(hopePrice + "원으로 쿨하게 구매 제안합니다.");

    }


    @Test()
    @DisplayName("쿨 구매자")
    void makeCoolSellerObject() {

        int hopePrice = 2000;
        Trader trader = sellerFactory.getTrader(true, hopePrice);
        trader.trading();

        assertThat(trader).isOfAnyClassIn(CoolSeller.class);
        assertThat(trader.requestTrade()).isEqualTo(hopePrice + "원으로 쿨하게 판매 제안합니다.");

    }

}