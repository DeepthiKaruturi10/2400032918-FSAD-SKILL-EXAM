package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.service.SupplierOrderService;

@RestController
@RequestMapping("/supplierorder")
public class SupplierOrderController {

    @Autowired
    private SupplierOrderService service;

    @PostMapping("/add")
    public SupplierOrder addOrder(@RequestBody SupplierOrder order) {
        return service.addSupplierOrder(order);
    }

    @GetMapping("/viewall")
    public List<SupplierOrder> getOrders() {
        return service.viewAllOrders();
    }
}