package com.variable;

import org.testng.annotations.Test;

/**
 * @author liwen406
 * @Title: TestInner
 * @Description:
 * @date 2019/2/17 / 9:21
 */
public class TestInner {

    @Test
    void persondomeTest() {
        Persondome p = new Persondome();
        Persondome.Heart heart = p.new Heart();
        heart.jump();
        p.setLive(false);
        heart.jump();

    }

    @Test
    void newnner() {
        FlyAble flyAble = new FlyAble(){
            @Override
            public void fly() {
                System.out.println("my is fly...");
            }
        };

        flyAble.fly();

        /**
         *  创建匿名内部类,直接传递给showFly(FlyAble f)
         */
        showFly(new FlyAble(){
            @Override
            public void fly() {
                System.out.println("dddd");
            }
        });

    }

    private void showFly(FlyAble f) {
        f.fly();
    }
}
