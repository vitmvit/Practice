package exchange.impl;

import conf.ConfProvider;
import exchange.Exchange;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class DollarsToRubles implements Exchange {

    private static final String EXCHANGE_DOLLAR = "exchange.dollar";
    private final ConfProvider confProvider;

    public DollarsToRubles() {
        confProvider = new ConfProvider();
    }

    public BigDecimal exchange(BigDecimal currency) {
        Map<String, BigDecimal> map = confProvider.exchangeConf();
        // TODO: проверка на null
        return currency.multiply(map.get(EXCHANGE_DOLLAR))
                .setScale(confProvider.getRoundScale(), RoundingMode.HALF_UP);
    }
}
