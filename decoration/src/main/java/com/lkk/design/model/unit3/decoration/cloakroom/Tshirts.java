package com.lkk.design.model.unit3.decoration.cloakroom;

import lombok.extern.slf4j.Slf4j;

/**
 * 衣帽间中的T恤类
 *
 * @author Quid Lee
 * @date 2019/5/29 09:29
 */
@Slf4j
public class Tshirts extends Checkroom{

    /**
     * 穿上T恤后展示
     */
    @Override
    public void show() {
        log.info("T恤");
        super.show();
    }
}
