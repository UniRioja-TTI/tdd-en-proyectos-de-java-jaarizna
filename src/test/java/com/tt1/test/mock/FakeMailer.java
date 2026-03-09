package com.tt1.test.mock;

import interfaces.Mailer;

public class FakeMailer implements Mailer{
	public String lastEmail;
    public String lastMessage;
    public int sendCount = 0;
    
	@Override
	public boolean enviar(String email, String mensaje) {
		 lastEmail = email;
	        lastMessage = mensaje;
	        sendCount++;
	        return true;
	}

}
