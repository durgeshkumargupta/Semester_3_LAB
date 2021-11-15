package com.durgesh;


import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;
public class MyResource extends CoapResource
{

	private int i=0;
	public MyResource(String name) {
		super(name);
	}
	
	@Override
	public void handleGET(CoapExchange exchange)
	{
		exchange.respond("Hello "+ i++);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e1) {
			e1.printStackTrace();
		}catch (Exception e2) {
			e2.printStackTrace();	
		}
	}

	public static void main(String[] args) {
		CoapServer server=new CoapServer();
		server.add(new MyResource("Hello"));
		server.add(new MyResource("Hello2"));
		server.start();
	}
}
