package org.tko.newDesignPattern.designpattern.iterator;

/**
 * 迭代器接口
 * 
 * @author abel-sun
 *
 * @param <T>
 */
public interface Iterator<T> {

    public T first();

    public T next();

    public boolean isDone();

    public T currentItem();

}
