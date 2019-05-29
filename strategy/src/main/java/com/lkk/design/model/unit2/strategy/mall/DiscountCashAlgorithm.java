package com.lkk.design.model.unit2.strategy.mall;

/**
 * 含有折扣的收银算法
 *
 * @author Quid Lee
 * @date 2019/5/27 18:10
 */
public class DiscountCashAlgorithm extends BaseCashAlgorithm {
    private Double discount = 1.0;

    public DiscountCashAlgorithm(){}

    public DiscountCashAlgorithm(Double discount) {
        this.discount = discount;
    }

    @Override
    public Double getTotalMoney(Double amountReceivable) {
        return amountReceivable * discount;
    }
}
