package org.tko.newDesignPattern.designpattern.factory.simple;

/**
 * 加法类
 * 
 * @author abel-sun
 *
 */
public class OperationAdd extends Operation {

    @Override
    public double result() {
	return numberA + numberB;
    }

}