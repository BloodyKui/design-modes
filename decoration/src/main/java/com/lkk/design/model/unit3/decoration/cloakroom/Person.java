package com.lkk.design.model.unit3.decoration.cloakroom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 人
 *
 * @author Quid Lee
 * @date 2019/5/29 09:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Person implements Behavior{
    /**
     * 姓名
     */
    private String name;

    @Override
    public void show() {
        log.info("打扮过的" + name);
    }

}
