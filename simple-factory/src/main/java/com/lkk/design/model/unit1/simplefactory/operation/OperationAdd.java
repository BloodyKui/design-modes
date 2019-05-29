package com.lkk.design.model.unit1.simplefactory.operation;

/**
 * 加法运算
 *
 * @author Quid Lee
 * @date 2019.05.27
 */
public class OperationAdd  extends BaseOperation{


    @Override
    public Double getRresult() {
        Double result = 0.0;
        result = numberA + numberB;
        return result;
    }
}
