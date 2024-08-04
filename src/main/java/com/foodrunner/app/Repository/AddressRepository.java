package com.foodrunner.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrunner.app.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
