package com.lkk.design.model.unit3.decoration.cloakroom;

import lombok.extern.slf4j.Slf4j;

/**
 * 衣帽间中的鞋子类
 *
 * @author Quid Lee
 * @date 2019/5/29 09:33
 */
@Slf4j
public class Shoes extends Checkroom{

    @Override
    public void show() {
        log.info("鞋");
        super.show();
    }
}
