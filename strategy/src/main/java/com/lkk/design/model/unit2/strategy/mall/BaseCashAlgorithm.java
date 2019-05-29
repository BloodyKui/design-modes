package com.lkk.design.model.unit2.strategy.mall;

/**
 * 收银算法基类
 *
 * @author Quid Lee
 * @date 2019/5/27 18:05
 */
public abstract class BaseCashAlgorithm {

    /**
     * 输入应收金额获取实际支付金额
     *
     * @param amountReceivable 应收金额
     * @return 实际金额
     */
    public abstract Double getTotalMoney(Double amountReceivable);
}
