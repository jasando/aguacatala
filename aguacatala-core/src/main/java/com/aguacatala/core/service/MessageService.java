package com.aguacatala.core.service;

/**
 * Service for handling message operations such as sending, retrieving, etc.
 * @author javier.sandoval
 *
 */
public interface MessageService {
	
	String getMessage();
	
	void sendMessage(String message);
	
}
