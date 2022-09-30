package com.edubridge.stores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.stores.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
