package com.lkk.design.model.unit1.simplefactory.operation;

/**
 * 乘法运算类
 *
 * @author Quid Lee
 * @date 2019/5/27 16:01
 */
public class OperationMul extends BaseOperation{

    @Override
    public Double getRresult() {
        Double result = 0.0;
        result = numberA * numberB;
        return result;
    }
}
