package com.lkk.design.model.unit4.proxymode;

import com.lkk.design.model.unit4.proxymode.woo.Middleman;
import com.lkk.design.model.unit4.proxymode.woo.SchoolGirl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
// @SpringBootTest
public class ProxyModeApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void proxyMode(){
        SchoolGirl schoolGirl = new SchoolGirl("兰大锤");
        Middleman middleman = new Middleman(schoolGirl);
        middleman.flower();
        middleman.dolls();
        middleman.chocolate();
    }
}
