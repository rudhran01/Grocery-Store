package com.edubridge.stores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.stores.entity.Customer;

public interface UserAdmRepository extends JpaRepository<Customer,Long>
{

}
