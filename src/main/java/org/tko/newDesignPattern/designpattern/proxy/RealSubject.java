package org.tko.newDesignPattern.designpattern.proxy;

/**
 * 真实实体类
 * 
 * @author abel-sun
 *
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
	System.out.println("真实对象的请求");
    }

}
