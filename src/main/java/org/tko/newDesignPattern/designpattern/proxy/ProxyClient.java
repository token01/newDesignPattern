package org.tko.newDesignPattern.designpattern.proxy;

/**
 * 代理客户端
 * 
 * @author abel-sun
 *
 */
public class ProxyClient {
    public static void main(String[] args) {
	Proxy proxy = new Proxy();
	proxy.request();
    }
}
