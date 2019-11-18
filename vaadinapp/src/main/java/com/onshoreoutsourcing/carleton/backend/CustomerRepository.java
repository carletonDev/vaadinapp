package com.onshoreoutsourcing.carleton.backend;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onshoreoutsourcing.carleton.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
