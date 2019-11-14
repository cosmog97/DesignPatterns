package it.unical.mat.ingsw.DesignPatterns.structurals.proxy.protectionproxy;

public class Client {
	public static void main(String[] args) throws Exception {
		Internet internet = new ProxyInternet();

		internet.connectTo("geeksforgeeks.org");
		internet.connectTo("abc.com");

	}
}