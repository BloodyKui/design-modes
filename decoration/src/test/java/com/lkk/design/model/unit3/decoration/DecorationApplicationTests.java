package com.lkk.design.model.unit3.decoration;

import com.lkk.design.model.unit3.decoration.cloakroom.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
// @SpringBootTest
public class DecorationApplicationTests {

    @Test
    public void contextLoads() {
    }

    /**
     * 衣帽间测试
     */
    @Test
    public void cloakroomTest(){
        Person person = new Person("九五");
        Checkroom checkroom = new Checkroom();
        Tshirts tshirts = new Tshirts();
        Pants pants = new Pants();
        Shoes shoes = new Shoes();
        // 穿衣服
        tshirts.decorate(person);
        // 穿裤子
        pants.decorate(tshirts);
        // 穿鞋子
        shoes.decorate(pants);
        shoes.show();
    }
}
