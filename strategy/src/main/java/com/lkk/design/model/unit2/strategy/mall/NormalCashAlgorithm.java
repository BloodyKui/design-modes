package com.lkk.design.model.unit2.strategy.mall;

/**
 * 正常收银算法
 *
 * @author Quid Lee
 * @date 2019/5/27 18:07
 */
public class NormalCashAlgorithm extends BaseCashAlgorithm{
    @Override
    public Double getTotalMoney(Double amountReceivable) {
        return amountReceivable;
    }
}
