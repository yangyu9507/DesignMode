package com.yaron.facade;

import com.yaron.facade.equipment.*;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class HomeTheaterFacade {

    // 定义各个子系统对象
    private Light light;         // 灯光
    private Popcorn popcorn;     // 爆米花机
    private Stereo stereo;       // 立体声
    private Projector projector; // 投影仪
    private Screen screen;       // 屏幕
    private DVDPlayer dvdPlayer; // DVD播放器

    public HomeTheaterFacade() {
        this.light = Light.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.off();
        light.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        light.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
