package com.lkk.design.model.unit1.simplefactory.operation;

/**
 * 减法运算类
 *
 * @author Quid Lee
 * @date 2019/5/27 15:57
 */
public class OperationSub extends BaseOperation{

    @Override
    public Double getRresult() {
        Double result = 0.0;
        result = numberA - numberB;
        return result;
    }
}
