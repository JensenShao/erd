package com.erdframework.erdweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * ${DESCRIPTION}
 *
 * @author Shao Zhen Jun
 * @created 2018-05-28-14:50
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConvertTest {

    Long price = Long.parseLong(String.valueOf("12"));

    @Test
    public void testLong(){
        Assert.isTrue(price.equals(12L),"success");
    }
    @Test
    public void testDouble(){
        Double price = Double.parseDouble("12.0");
        Assert.isTrue(price.equals(12.0),"success");
    }
}
