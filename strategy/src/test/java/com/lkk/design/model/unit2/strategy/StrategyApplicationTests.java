package com.lkk.design.model.unit2.strategy;

import com.lkk.design.model.unit2.strategy.mall.CashAlgorithmFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
// @SpringBootTest
@Slf4j
public class StrategyApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void strategyTest() {
        Integer type = 2;
        Double receiveMoney = 600.0;
        CashAlgorithmFactory cashAlgorithmFactory = new CashAlgorithmFactory(type);
        Double result = cashAlgorithmFactory.getResult(receiveMoney);
        log.warn("最终结果:" + result);
    }
}
