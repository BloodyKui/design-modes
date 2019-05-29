package com.lkk.design.model.unit3.decoration.cloakroom;

import lombok.extern.slf4j.Slf4j;

/**
 * 衣帽间中的裤子类
 *
 * @author Quid Lee
 * @date 2019/5/29 09:31
 */
@Slf4j
public class Pants extends Checkroom{

    /**
     * 穿裤子后展示
     */
    @Override
    public void show() {
        log.info("裤子");
        super.show();
    }
}
