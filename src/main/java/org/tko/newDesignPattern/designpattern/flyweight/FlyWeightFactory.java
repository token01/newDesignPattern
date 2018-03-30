package org.tko.newDesignPattern.designpattern.flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 * 
 * @author abel-sun
 *
 */
public class FlyWeightFactory {
    private HashMap<String, FlyWeight> flyWeights = new HashMap<String, FlyWeight>();

    public FlyWeight getFlyWeight(String key) {
	if (!flyWeights.containsKey(key)) {
	    flyWeights.put(key, new ConcreteFlyWeight());
	}

	return flyWeights.get(key);
    }

}
