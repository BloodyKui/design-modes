package com.lkk.design.model.unit4.proxymode.woo;

import lombok.extern.slf4j.Slf4j;

/**
 * 追求者
 *
 * @author Quid Lee
 * @date 2019/5/29 10:27
 */
@Slf4j
public class Pursuit implements GiveGift{

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void flower() {
        log.info(mm.getName() + ", 送你花");
    }

    @Override
    public void dolls() {
        log.info(mm.getName() + ", 送你洋娃娃");
    }

    @Override
    public void chocolate() {
        log.info(mm.getName() + ", 送你巧克力");
    }
}
