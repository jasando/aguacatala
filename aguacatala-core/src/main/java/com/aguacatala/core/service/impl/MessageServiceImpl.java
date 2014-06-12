package com.aguacatala.core.service.impl;

import org.springframework.stereotype.Component;

import com.aguacatala.core.service.MessageService;

@Component
public class MessageServiceImpl implements MessageService{

	public String getMessage() {
		return "hello fuckers1!";
		
	}

	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		
	}
}