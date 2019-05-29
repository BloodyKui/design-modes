package com.lkk.design.model.unit2.strategy.mall;

/**
 * 现金收取系统策略工厂
 *
 * @author Quid Lee
 * @date 2019/5/28 09:44
 */
public class CashAlgorithmFactory {

    private BaseCashAlgorithm baseCashAlgorithm;

    public CashAlgorithmFactory(Integer receiveType) {
        /*
         * 根据不同的收款策略获取对应的收款算法
         */
        switch (receiveType) {
            case 0:
                //不进行优惠活动
                this.baseCashAlgorithm = new NormalCashAlgorithm();
                break;
            case 1:
                // 打8折活动
                this.baseCashAlgorithm = new DiscountCashAlgorithm(0.8);
                break;
            case 2:
                // 满300减100活动
                this.baseCashAlgorithm = new RebateCashAlgorithm(300.0, 100.0);
                break;
            default:
        }
    }

    /**
     * 获取最终收款金额
     * @param amountReceivable 应收金额
     * @return 实际收款金额
     */
    public Double getResult(Double amountReceivable) {
        return baseCashAlgorithm.getTotalMoney(amountReceivable);
    }
}
