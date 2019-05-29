package com.lkk.design.model.unit1.simplefactory;

import com.lkk.design.model.unit1.simplefactory.operation.BaseOperation;
import com.lkk.design.model.unit1.simplefactory.operation.OperationFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
// @SpringBootTest
@Slf4j
public class SimpleFactoryApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testFactory() {
        String operate = "*";
        BaseOperation operation = OperationFactory.createOperate(operate);
        operation.setNumberA(1.0);
        operation.setNumberB(0.0);
        Double result = operation.getRresult();
        log.info("运算结果: " + result);
    }
}
