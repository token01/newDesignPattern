package org.tko.newDesignPattern.designpattern.factory.simple;

/**
 * 乘法类
 * 
 * @author abel-sun
 *
 */
public class OperationMul extends Operation {

    @Override
    public double result() {
	return numberA * numberB;
    }

}