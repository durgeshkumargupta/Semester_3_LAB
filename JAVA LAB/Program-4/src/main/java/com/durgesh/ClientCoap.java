package com.durgesh;

import java.io.IOException;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.elements.exception.ConnectorException;

public class ClientCoap 
{
	public static void main(String[] args) {
		CoapClient c1=new CoapClient("coap://127.0.0.1/Hello");
		
		try
		{
			String text=c1.get().getResponseText();
			System.out.println(text);
		}
		catch (ConnectorException e1) {
			e1.printStackTrace();
		}catch (IOException e2) {
			e2.printStackTrace();
		}catch (Exception e3) {
			e3.printStackTrace();
		}
	
		try
		{
			System.out.println("End of Client");
			c1.delete();
		}catch (ConnectorException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
