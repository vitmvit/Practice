package calculator.impl;

import calculator.Calculator;
import conf.ConfProvider;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Addition implements Calculator {

    private final ConfProvider confProvider;

    public Addition() {
        confProvider = new ConfProvider();
    }

    @Override
    public BigDecimal calculate(BigDecimal var1, BigDecimal var2) {
        return var1.add(var2).setScale(confProvider.getRoundScale(), RoundingMode.HALF_UP);
    }
}
