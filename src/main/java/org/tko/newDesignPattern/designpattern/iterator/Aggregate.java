package org.tko.newDesignPattern.designpattern.iterator;

/**
 * 聚集接口
 * 
 * @author abel-sun
 *
 * @param <T>
 */
public interface Aggregate<T> {

    public Iterator<T> createIterator();
}
