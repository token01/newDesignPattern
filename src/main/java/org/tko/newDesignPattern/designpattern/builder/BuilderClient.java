package org.tko.newDesignPattern.designpattern.builder;

/**
 * 设计模式-建造者模式（build）
 * http://www.cnblogs.com/lwbqqyumidi/p/3742562.html
 * @author abel-sun
 *
 */
public class BuilderClient {

    public static void main(String[] args) {
	Director director = new Director();
	Builder builder1 = new ConcreteBuilder1();
	Builder builder2 = new ConcreteBuilder2();

	director.construct(builder1);
	Product product1 = builder1.getBuildResult();
	product1.show();

	director.construct(builder2);
	Product product2 = builder2.getBuildResult();
	product2.show();

    }

}
