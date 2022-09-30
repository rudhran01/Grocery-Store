package com.edubridge.stores.service;

import javax.mail.MessagingException;

import com.edubridge.stores.entity.Contact;

public interface ContactService {
	
	void saveContacts(Contact contact) throws MessagingException;

}
