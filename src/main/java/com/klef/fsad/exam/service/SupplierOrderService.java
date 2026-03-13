package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.repository.SupplierOrderRepository;

@Service
public class SupplierOrderService {

    @Autowired
    private SupplierOrderRepository supplierOrderRepository;

    public SupplierOrder addSupplierOrder(SupplierOrder supplierOrder) {
        if (supplierOrder.getSupplierOrderId() == null) {
            throw new RuntimeException("SupplierOrder ID must not be null");
        }
        return supplierOrderRepository.save(supplierOrder);
    }

    public List<SupplierOrder> getAllSupplierOrders() {
        return supplierOrderRepository.findAll();
    }
}
