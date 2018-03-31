package org.tko.newDesignPattern.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计模式-命令模式
 * 创建一个具体命令对象并设定它的接收者
 * 将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请 求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 * @author abel-sun
 *
 */
public class CommandClient {

    public static void main(String[] args) {
	List<Reciever> recievers = new ArrayList<Reciever>();

	recievers.add(new RecieverA());
	recievers.add(new RecieverB());
	recievers.add(new RecieverC());

	Command command = new ConcreteCommand(recievers);
	Invoker invoker = new Invoker();

	invoker.setCommand(command);
	invoker.executeCommand();

    }

}
