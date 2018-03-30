package org.tko.newDesignPattern.designpattern.factory.simple;

/**
 * 减法类
 * 
 * @author abel-sun
 *
 */
public class OperationSub extends Operation {

    @Override
    public double result() {
	return numberA - numberB;
    }

}