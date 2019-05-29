package com.lkk.design.model.unit3.decoration.cloakroom;

/**
 * 人的衣帽间
 *
 * @author Quid Lee
 * @date 2019/5/29 09:24
 */
public class Checkroom extends Person{
    /**
     * 待装饰的人
     */
    protected Person component;

    /**
     * 放入等待打扮的人
     * @param component 待打扮的人
     */
    public void decorate(Person component){
        this.component = component;
    }

    /**
     * 装饰后的呈现
     */
    @Override
    public void show() {
        // 如果当前有人在衣帽间, 则进行展示
        if (this.component != null) {
            this.component.show();
        }
    }
}
