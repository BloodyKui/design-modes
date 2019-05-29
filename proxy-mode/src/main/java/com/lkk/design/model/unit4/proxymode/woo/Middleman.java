package com.lkk.design.model.unit4.proxymode.woo;

/**
 * 追求者的代理人
 *
 * @author Quid Lee
 * @date 2019/5/29 10:27
 */
public class Middleman implements GiveGift {
    private Pursuit pursuit;

    public Middleman(SchoolGirl mm) {
        // 中间人只是做代理，实际将MM与追求者关联
        this.pursuit = new Pursuit(mm);
    }

    @Override
    public void flower() {
        this.pursuit.flower();
    }

    @Override
    public void dolls() {
        this.pursuit.dolls();
    }

    @Override
    public void chocolate() {
        this.pursuit.chocolate();
    }
}
