package org.tko.newDesignPattern.designpattern.builder;

/**
 * @author abel-sun
 * 定义Builder接口（工人接口
 * 工人接口，定义了工人所要进行的工作。他们负责进行具体部件如窗户，地板的建造。同时因为房子是民工建的，因此建设完成后由他把房子递交回房主
 */
public abstract class Builder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getBuildResult();
}
