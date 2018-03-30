package org.tko.newDesignPattern.designpattern.memento;

/**
 * 备忘录（Memento）类
 * 
 * @author abel-sun
 *
 */
public class Memento {
    private String state;

    public Memento(String state) {
	this.state = state;
    }

    public String getState() {
	return state;
    }

    public void setState(String state) {
	this.state = state;
    }

}
