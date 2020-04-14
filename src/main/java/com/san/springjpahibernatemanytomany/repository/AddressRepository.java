package com.san.springjpahibernatemanytomany.repository;

import com.san.springjpahibernatemanytomany.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
