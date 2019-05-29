package com.lkk.design.model.unit2.strategy.mall;

import lombok.Data;

/**
 * 含有满减的收银计算
 *
 * @author Quid Lee
 * @date 2019/5/27 18:15
 */
@Data
public class RebateCashAlgorithm  extends BaseCashAlgorithm{
    /**
     * 满减标准金额
     */
    private Double standard = 0.0;

    /**
     * 折扣金额
     */
    private Double subtract = 0.0;

    public RebateCashAlgorithm() {
    }

    public RebateCashAlgorithm(Double standard, Double subtract) {
        this.standard = standard;
        this.subtract = subtract;
    }

    @Override
    public Double getTotalMoney(Double amountReceivable) {
        // 如果应收金额大于等于了满减标准金额，则计算需要折扣的金额
        if (standard > 0.0 && amountReceivable >= standard) {
            // 向下取整计算应收金额高于标准金额的倍数
            double mul = Math.floor(amountReceivable / standard);
            amountReceivable = amountReceivable - (mul * subtract);
        }
        return amountReceivable;
    }
}
