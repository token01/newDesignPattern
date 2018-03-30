package org.tko.newDesignPattern.designpattern.interpreter;

/**
 * 声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享
 * 
 * @author abel-sun
 *
 */
public abstract class AbstractExpression {

    public abstract void interpret(Context context);
}
