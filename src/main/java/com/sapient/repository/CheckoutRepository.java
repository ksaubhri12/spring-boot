package com.sapient.repository;

import com.sapient.model.CheckoutModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutModel, Long> {


}
