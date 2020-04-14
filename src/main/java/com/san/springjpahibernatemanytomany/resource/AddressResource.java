package com.san.springjpahibernatemanytomany.resource;

import com.san.springjpahibernatemanytomany.model.Address;
import com.san.springjpahibernatemanytomany.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class AddressResource {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/all")
    public List<Address> getAll() {
        return addressRepository.findAll();
    }
}
