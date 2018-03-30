package org.tko.newDesignPattern.designpattern.builder;

/**
 * 指挥者类，用来指挥建造过程
 * 
 * @author abel-sun
 *
 */
public class Director {

    public void construct(Builder builder) {
	builder.buildPartA();
	builder.buildPartB();
    }
}
