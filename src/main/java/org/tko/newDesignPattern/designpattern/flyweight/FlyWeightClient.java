package org.tko.newDesignPattern.designpattern.flyweight;

/**
 * 客户端
 * 享元设计模式
 * @author abel-sun
 *
 */
public class FlyWeightClient {
    public static void main(String[] args) {
	int extrinsicState = 22;

	FlyWeightFactory f = new FlyWeightFactory();

	FlyWeight fx = f.getFlyWeight("X");
	fx.operation(--extrinsicState);

	FlyWeight fy = f.getFlyWeight("Y");
	fy.operation(--extrinsicState);

	FlyWeight fz = f.getFlyWeight("Z");
	fz.operation(--extrinsicState);

	FlyWeight uf = new UnsharedConcreteFlyWeight();
	uf.operation(--extrinsicState);

    }

}
