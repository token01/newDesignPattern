package org.tko.newDesignPattern.designpattern.template;

/**
 * 模板方法客户端
 * 
 * @author abel-sun
 *
 */
public class TemplateClient {
    public static void main(String[] args) {
	AbstractTemplate abstractTemplate;

	abstractTemplate = new ConcreteClassA();
	abstractTemplate.templateMethod();

	abstractTemplate = new ConcreteClassB();
	abstractTemplate.templateMethod();

    }
}
