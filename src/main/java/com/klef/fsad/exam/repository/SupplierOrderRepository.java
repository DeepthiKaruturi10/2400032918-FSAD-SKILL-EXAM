package com.klef.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsad.exam.model.SupplierOrder;

@Repository
public interface SupplierOrderRepository extends JpaRepository<SupplierOrder, Integer> {

}
