package com.lkk.design.model.unit1.simplefactory.operation;

/**
 * 除法运算类
 *
 * @author Quid Lee
 * @date 2019/5/27 16:02
 */
public class OperationDiv extends BaseOperation {

    @Override
    public Double getRresult() {
        Double result = 0.0;
        if (numberB == 0.0) {
            throw new RuntimeException("除数不能为0!");
        }
        result = numberA / numberB;
        return result;
    }
}
