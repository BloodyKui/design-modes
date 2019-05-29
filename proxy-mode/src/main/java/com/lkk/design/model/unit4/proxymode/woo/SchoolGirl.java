package com.lkk.design.model.unit4.proxymode.woo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 学校女孩儿
 *
 * @author Quid Lee
 * @date 2019/5/29 10:24
 */
@Data
@Slf4j
public class SchoolGirl {
    private String name;

    public SchoolGirl(String name) {
        this.name = name;
    }
}
