package com.lkk.design.model.unit1.simplefactory.operation;

import lombok.Data;

/**
 * 运算基类
 *
 * @author Quid Lee
 * @date 2019.05.27
 */
@Data
public abstract class BaseOperation {

    protected Double numberA = 0.0;

    protected Double numberB = 0.0;

    /**
     * 获取结果
     * @return
     */
    public abstract Double getRresult();
}
