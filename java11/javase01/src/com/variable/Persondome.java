package com.variable;

/**
 * @author liwen406
 * @Title: dome
 * @Description:
 * @date 2019/2/17 / 9:02
 */
public class Persondome {
    private boolean live = true;

    class Heart {
        public void jump() {
            if (live) {
                System.out.println("心条");
            } else {
                System.out.println("心不跳");
            }
        }
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }


}
